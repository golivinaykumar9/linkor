package com.linkor.controller;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.linkor.ENUM.UserENUM;
import com.linkor.model.User;
import com.linkor.model.UserLogin;
import com.linkor.model.UserProfile;
import com.linkor.model.UserProfile;
import com.linkor.service.MailingService;
import com.linkor.service.UserLoginService;
import com.linkor.service.UserProfileService;
import com.linkor.service.UserService;
import com.linkor.service.UserSignUpService;



@Controller
@RequestMapping("/")
@SessionAttributes("roles")
public class AppController {

	@Autowired
	UserService userService;
	
	@Autowired
	UserProfileService userProfileService;
	
	@Autowired
	UserSignUpService userSignUpService;
	
	@Autowired
	MailingService mailingService;
	
	@Autowired
	UserLoginService userLoginService;
	
	
	@Autowired
	MessageSource messageSource;

	/**
	 * This method will list all existing users.
	 */
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {
		return "index1";
	}

	/**
	 * This method will provide the medium to add a new user.
	 */
	@RequestMapping(value = { "/newuser" }, method = RequestMethod.GET)
	public String newUser(ModelMap model) {
		User user = new User();
		model.addAttribute("user", user);
		model.addAttribute("edit", false);
		return "registration";
	}

	/**
	 * This method will be called on form submission, handling POST request for
	 * saving user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/newuser" }, method = RequestMethod.POST)
	public String saveUser(@Valid User user, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "registration";
		}

		if(!userService.isUserSSOUnique(user.getId(), user.getSsoId())){
			FieldError ssoError =new FieldError("user","ssoId",messageSource.getMessage("non.unique.ssoId", new String[]{user.getSsoId()}, Locale.getDefault()));
		    result.addError(ssoError);
			return "registration";
		}
		
		userService.saveUser(user);
		
		model.addAttribute("success", "User " + user.getFirstName() + " "+ user.getLastName() + " registered successfully");
		//return "success";
		return "registrationsuccess";
	}

	/**
	 * This method will be called on form submission, handling POST request for
	 * saving user in database. It also validates the user input
	 */
	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public String saveUserSignUp(@Valid UserProfile userSignUp, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "index1";
		}
		if(!userSignUpService.checkSignUp(userSignUp.getUserName(), userSignUp.getEmailId())){
			FieldError ssoError =new FieldError("userName","emailId",messageSource.getMessage("non.unique.emailId", new String[]{userSignUp.getEmailId()}, Locale.getDefault()));
		    result.addError(ssoError);
		    return "index1";
		}
		userSignUp.setCreatedDate(new Date());
		userSignUp.setStatus(UserENUM.ACTIVE.getStatusCode());
		userSignUp.setUpdatedDate(new Date());
		userSignUp.setStateIndicater(UserENUM.PENDING.getStatusCode());
		userSignUpService.saveUserSignUp(userSignUp);
		
		//mailingService.sendMail(userSignUp.getEmailId(), "golivinaykumar9@gmail.com", "Verification Code", "Verification Code  "+userSignUp.getVerificationCode());
			
		return "index1";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String userLogin(@Valid UserLogin userSignUp, BindingResult result,
			ModelMap model) {

		if(userSignUp.getUserName()==null || userSignUp.getUserName().isEmpty() || userSignUp.getPassword() == null || userSignUp.getPassword().isEmpty()){
			if(userSignUp.getUserName()==null || userSignUp.getUserName().isEmpty()){
				FieldError userNameError =new FieldError("userSignUp","userName",messageSource.getMessage("non.unique.userNameLogin", new String[]{}, Locale.getDefault()));
			    result.addError(userNameError);
			    }
			if(userSignUp.getPassword() == null || userSignUp.getPassword().isEmpty()){
				FieldError passwordError =new FieldError("userName","password",messageSource.getMessage("non.unique.passwordLogin", new String[]{}, Locale.getDefault()));
			    result.addError(passwordError);
			    }
			model.addAttribute(UserENUM.FAILED.getStatusCode(), true);
			return "index1";
		}
		
		String loginStatus = userLoginService.checkLogin(userSignUp);
		if(UserENUM.ACTIVE.getStatusCode().equalsIgnoreCase(loginStatus)){
			return "home";
		}else if(UserENUM.PENDING.getStatusCode().equalsIgnoreCase(loginStatus)){
			return "activation";
			
		}else if(UserENUM.INACTIVE.getStatusCode().equalsIgnoreCase(loginStatus)){
			return "index1";
		}else {
			FieldError passwordError =new FieldError("userName","password",messageSource.getMessage("non.unique.passwordLogin", new String[]{}, Locale.getDefault()));
		    result.addError(passwordError);
		  
		}
		return "index1";
	}
	@RequestMapping(value = "/verify", method = RequestMethod.POST)
	public String userVerify(@RequestParam String verificationNumber, BindingResult result,
			ModelMap model) {
		if(verificationNumber.equals(null)){
			FieldError verificationNumberError =new FieldError("String","verificationNumber",messageSource.getMessage("notnull.verificationNumber", new String[]{}, Locale.getDefault()));
		    result.addError(verificationNumberError);
		    }
		return "activation";
	}
	/**
	 * This method will provide the medium to update an existing user.
	 */
	@RequestMapping(value = { "/edit-user-{ssoId}" }, method = RequestMethod.GET)
	public String editUser(@PathVariable String ssoId, ModelMap model) {
		User user = userService.findBySSO(ssoId);
		model.addAttribute("user", user);
		model.addAttribute("edit", true);
		return "registration";
	}
	
	/**
	 * This method will be called on form submission, handling POST request for
	 * updating user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/edit-user-{ssoId}" }, method = RequestMethod.POST)
	public String updateUser(@Valid User user, BindingResult result,
			ModelMap model, @PathVariable String ssoId) {

		if (result.hasErrors()) {
			return "registration";
		}

		/*//Uncomment below 'if block' if you WANT TO ALLOW UPDATING SSO_ID in UI which is a unique key to a User.
		if(!userService.isUserSSOUnique(user.getId(), user.getSsoId())){
			FieldError ssoError =new FieldError("user","ssoId",messageSource.getMessage("non.unique.ssoId", new String[]{user.getSsoId()}, Locale.getDefault()));
		    result.addError(ssoError);
			return "registration";
		}*/


		userService.updateUser(user);

		model.addAttribute("success", "User " + user.getFirstName() + " "+ user.getLastName() + " updated successfully");
		return "registrationsuccess";
	}

	
	/**
	 * This method will delete an user by it's SSOID value.
	 */
	@RequestMapping(value = { "/delete-user-{ssoId}" }, method = RequestMethod.GET)
	public String deleteUser(@PathVariable String ssoId) {
		userService.deleteUserBySSO(ssoId);
		return "redirect:/list";
	}
	

	/**
	 * This method will provide UserProfile list to views
	 */
	@ModelAttribute("roles")
	public List<UserProfile> initializeProfiles() {
		return userProfileService.findAll();
	}

}

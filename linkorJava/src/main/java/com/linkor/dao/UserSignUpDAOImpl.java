package com.linkor.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.linkor.model.UserSignUp;
@Repository("userSignUpDAO")
public class UserSignUpDAOImpl extends AbstractDao<Integer, UserSignUp> implements UserSignUpDAO {

	public UserSignUp findByUserName(String userName) {
		System.out.println("userName : " + userName);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("userName", userName));
		UserSignUp userSignUp = (UserSignUp) crit.uniqueResult();

		return userSignUp;
	}

	public void saveUserSignUp(UserSignUp userSignUp) {
		persist(userSignUp);

	}

	public UserSignUp findByEmailId(String emailId) {
		System.out.println("emailId : " + emailId);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("emailId", emailId));
		UserSignUp userSignUp = (UserSignUp) crit.uniqueResult();

		return userSignUp;
	}
	
	public List<UserSignUp> checkSignUp(String userName,String emailId) {
		Criteria crit = createEntityCriteria();
		Criterion userNameCrit = Restrictions.eq("userName", userName);
		Criterion emailIdCrit = Restrictions.eq("emailId", emailId);
		LogicalExpression orExp = Restrictions.or(userNameCrit,emailIdCrit);
		crit.add(orExp);
		return (List<UserSignUp>)crit.list();
	}
	public List<UserSignUp> checkLogin(String userName,String pasword) {
		Criteria crit = createEntityCriteria();
		Criterion userNameCrit = Restrictions.eq("userName", userName);
		Criterion emailIdCrit = Restrictions.eq("password", pasword);
		LogicalExpression orExp = Restrictions.and(userNameCrit,emailIdCrit);
		crit.add(orExp);
		return (List<UserSignUp>)crit.list();
	}

}

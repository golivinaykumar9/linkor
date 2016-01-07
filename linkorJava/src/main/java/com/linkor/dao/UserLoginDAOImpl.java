package com.linkor.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.linkor.ENUM.UserENUM;
import com.linkor.model.User;
import com.linkor.model.UserLogin;
import com.linkor.model.UserProfile;

@Repository("UserLoginDAO")
public class UserLoginDAOImpl extends AbstractDao<Integer, UserLogin> implements UserLoginDAO {

	@Override
	public void insertUserLogin(UserLogin userLogin) {
		persist(userLogin);
		
	}

	@Override
	public List<UserLogin> fetchByUsrNamePass(UserLogin userLogin) {
		Criteria crit = createEntityCriteria();
		Criterion userNameCrit = Restrictions.eq("userName", userLogin.getUserName());
		Criterion passwordCrit = Restrictions.eq("password", userLogin.getPassword());
		Criterion statusCrit = Restrictions.eq("status", UserENUM.ACTIVE.getStatusCode());
		Conjunction orExp = Restrictions.and(userNameCrit,passwordCrit,statusCrit);
		crit.add(orExp);
		return (List<UserLogin>)crit.list();
		
	}
	
	

}

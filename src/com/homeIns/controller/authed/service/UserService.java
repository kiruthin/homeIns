package com.homeIns.controller.authed.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.homeIns.model.account.objects.Customer;
import com.homeIns.model.account.objects.User;

//@Scope(value = "session")
@Component
public class UserService {

	@Autowired
	private Dao<User> cUserDao;

	public void save() 
	{
		User cUser = new Customer();
		cUserDao.save(cUser);
	}

	public Collection<User> getAllUser()
	{
		return cUserDao.getAll();
	}
	public int saveUser(User cUser) {
		System.out.println("UserService "+ cUser);
		System.out.println("UserService "+ cUserDao);
		validate(cUser);
		return cUserDao.save(cUser);
	}
	private void validate(User cUser) {
		// Details omitted
	}
	public User getUser(int theId) {
		
		return cUserDao.get(theId);
	}
	public User getUser(String username) {
		
		return cUserDao.get(username);
	}

	public boolean authenticate(User user) {
		return user.getPassword().equals(cUserDao.get(user.getUsername()).getPassword());
	}
}
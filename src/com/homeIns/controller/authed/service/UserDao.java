package com.homeIns.controller.authed.service;

import java.util.Collection;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.homeIns.model.account.objects.Customer;
import com.homeIns.model.account.objects.User;

@Repository
@Transactional
public class UserDao implements Dao<User>{

    @Autowired
    private SessionFactory sessionFactory;

	public UserDao() {
		// TODO Auto-generated constructor stub
		
		System.out.println("created USERDAO");
	}
	@Override
	public User get(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(User t) {
		try 
		{
			this.sessionFactory.getCurrentSession().save(t);	
		}
		catch(Exception e) 
		{
			System.out.println("E="+ e);
			throw e;
		}
		return 0;
	}

	@Override
	public void delete(int theId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(User t) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public User get(String value) {
		User u ;
		try 
		{
			Session s = this.sessionFactory.getCurrentSession();
			Query q = s.createNativeQuery("SELECT a.* FROM users a WHERE a.username = :userid", User.class);	
			
			q.setParameter("userid", value);
			u =  (User) q.getSingleResult();

			System.out.println("PASSWORD: ="+ u.getPassword() +" UserDao SELECT = "+ u +" ");			
		}
		catch(Exception e) 
		{
			System.out.println("E="+ e);
			throw e;
		}
		return u;
	}

}

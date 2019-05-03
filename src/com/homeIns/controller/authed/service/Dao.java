package com.homeIns.controller.authed.service;

import java.util.Collection;

public interface Dao<T> 
{	
    public T get(int theId);
	public Collection < T > getAll();
    public int save(T t);
    public void delete(int theId);
    public void delete(T t);
	public T get(String value);
    
}
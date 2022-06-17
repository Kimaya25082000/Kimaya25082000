package com.tns.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class jpautil 
{
	private static EntityManagerFactory factory;
	private static EntityManager entitymanager;
	static 
	{
		factory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	public static EntityManager getEntitymanager1()
	{
		if(entitymanager==null||entitymanager.isOpen())
		{
			entitymanager = factory.createEntityManager();
		}
		return entitymanager;
	}
	public static EntityManager getEntitymanager() {
		// TODO Auto-generated method stub
		return null;
	}
}
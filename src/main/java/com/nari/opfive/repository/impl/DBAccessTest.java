package com.nari.opfive.repository.impl;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.junit.Test;

import com.nari.opfive.domain.Rootasseitem;

 

public class DBAccessTest {
	

	


	@Test
	public void getAllRootItems() {
		
		SessionFactory sessionfact;
		try {
			Configuration config = new Configuration().configure("hibernate.cfg.xml");
			sessionfact = config.buildSessionFactory();
		} catch (Throwable e) {
			throw new ExceptionInInitializerError(e);
		}
		Session session = sessionfact.openSession();
	    String rootItemSql = "select * from rootasseitem";
	    NativeQuery<Rootasseitem> query = session.createNativeQuery(rootItemSql, Rootasseitem.class);
	    List<Rootasseitem> rootitemlist = query.getResultList();
	    for(int i = 0; i < rootitemlist.size();i++) {
	    	System.out.println(rootitemlist.get(i).toString());
	    }
	    if(rootitemlist != null) {
	    	System.out.println("loading data completed!!");
	    }
	}
	

}

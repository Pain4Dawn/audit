package com.zunze.audit.domain.integration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class HibernateTest {

	@Test
	public void testHibernateConfiguration(){
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
	}
}

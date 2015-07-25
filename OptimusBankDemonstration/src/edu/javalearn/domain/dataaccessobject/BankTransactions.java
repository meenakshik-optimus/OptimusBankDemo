package edu.javalearn.domain.dataaccessobject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class BankTransactions {

	private Configuration configuration;
	private SessionFactory sessionFactory;
	private Session session;
	

	public BankTransactions() {
		configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		/**
		 * create sessionfactory
		 */
		sessionFactory = configuration.buildSessionFactory();
	}
	public double withdraw(double amount)
	{
		return
	}
}

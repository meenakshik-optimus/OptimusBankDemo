package edu.javalearn.domain.dataaccessobject;

import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.javalearn.domain.bankmodel.Customer;


public class CustomerDataAccess {
	private Configuration configuration;
	private SessionFactory sessionFactory;
	private Session session;
	private Customer customer;

	public CustomerDataAccess() {
		configuration = new Configuration();
		System.out.println("hu");
		configuration.configure("hibernate.cfg.xml");

		/**
		 * create sessionfactory
		 */
		sessionFactory = configuration.buildSessionFactory();
	}

	public void addCustomerDetails(String customerName, String gender,
			String dateOfBirth, String address, String city, String state,
			String pin, String telephoneNo, String fax, String email) {
		try {

			/**
			 * Get Session object
			 */
			session = sessionFactory.openSession();

			/**
			 * Starting Transaction
			 */
			Transaction transaction = session.beginTransaction();
			customer = new Customer();
			customer.setCustomerName(customerName);
			customer.setGender(gender);
			customer.setDateOfBirth(dateOfBirth);
			customer.setAddress(address);
			customer.setCity(city);
			customer.setState(state);
			customer.setPin(pin);
			customer.setTelephoneNo(telephoneNo);
			customer.setFax(fax);
			customer.setEmail(email);
			session.save(customer);

			transaction.commit();
			session.close();
			System.out.println("\n\n Details Added in database \n");

		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public int validateCustomer(String customerName, String dateOfBirth) {
		int status=0;
		try {

			/**
			 * Get Session object
			 */
			session = sessionFactory.openSession();

			/**
			 * Starting Transaction
			 */
			Transaction transaction = session.beginTransaction();
			String hql = "FROM Customer customer  WHERE customer.customerName=customerName";
			Query query = session.createQuery(hql);
			System.out.println("j");
			List<Customer> list = (List<Customer>) query.list();
			Iterator<Customer> iterator=list.iterator();
			//iterator=query.iterate();
			System.out.println(iterator.next());
			//iterator = results.iterator();
			if (iterator.hasNext()) {
				status=1;
				System.out.println("kk");
				
			} 
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return status;
	}
}

package com.cts;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cts.persistence.HibernateUtil;

public class UseEmployee {
	public static void main(String[] args) {
		Employee empObj1= new Employee(105,"Ginni5","Sharma",20340);

		  Transaction transaction = null;
		  String s=null;
		  System.out.println(" Hello Sonar" +s);
	        try (Session session1 = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session1.beginTransaction();
	            // save the student objects	
	            session1.save(empObj1);
	            transaction.commit();
	            System.out.println(" Data Saved");
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }

	}
}
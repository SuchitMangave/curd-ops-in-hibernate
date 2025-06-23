package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employeeinsert {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		e.setEmpName("Ram");
		e.setDept("JRManager");
		e.setCity("NSK");
		e.setSalary("17LPA");

//		ss.persist(e);
		ss.save(e);

		tr.commit();
		ss.close();

		System.out.println("Data is Inserted....");

	}

}

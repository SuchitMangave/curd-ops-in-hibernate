package com.jbk;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.*;
public class Employeeupdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addClass(Employee.class);
		
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpID(1);
		emp.setEmpName("Ravi Kumar");
	    emp.setSalary("16lpa");
	    
	    ss.update(emp);
	    ss.merge(emp);
	    
	    tr.commit();
	    ss.close();
	    
		
		
		
		
	}

}

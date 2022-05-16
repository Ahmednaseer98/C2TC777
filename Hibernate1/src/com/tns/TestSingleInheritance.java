package com.tns;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestISingleInheritance {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee e= new Employee();
		e.setEmpName("ahmed");
		e.setEmpSalary(10000);
		em.persist(e);
		
		Manager m = new Manager();
		m.setEmpName("roshan");
		m.setEmpSalary(20000);
		m.setDepName("Training");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("Row Inserted");
		em.close();
		factory.close();
		
		
		
		
		
		

	}

}
package main.java.com.xworkz.forest.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main.java.com.xworkz.forest.entity.ForestEntity;

public class Query8 {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findCount");
		Object obj = query.getSingleResult();
		long l =  (long) obj;
		System.out.println(l);
		manager.close();

	}

}

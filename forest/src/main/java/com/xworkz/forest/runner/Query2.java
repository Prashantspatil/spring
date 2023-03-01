package main.java.com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main.java.com.xworkz.forest.entity.ForestEntity;

public class Query2 {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByState");
		Object object = query.getSingleResult();
		ForestEntity entity = (ForestEntity) object;
		System.out.println(entity);
		manager.close();

	}

}

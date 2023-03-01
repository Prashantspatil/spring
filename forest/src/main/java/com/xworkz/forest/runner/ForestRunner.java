package main.java.com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import main.java.com.xworkz.forest.entity.ForestEntity;

public class ForestRunner {

	public static void main(String[] args) {
		
		System.out.println("running ForestRunner");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ForestEntity entity1 = new ForestEntity(0, "bhadra", "karnataka", "490", "deciduous");
		ForestEntity entity2 = new ForestEntity(0, "prashant", "sikkim", "480", "tropical");
		ForestEntity entity3 = new ForestEntity(0, "omkar", "tamilnadu", "470", "subtropical");
		ForestEntity entity4 = new ForestEntity(0, "pavan", "gujarat", "600", "thorne");
		ForestEntity entity5 = new ForestEntity(0, "satish", "andhrapradesh", "450", "dry");
		ForestEntity entity6 = new ForestEntity(0, "rudra", "telangana", "440", "rainy");
		ForestEntity entity7 = new ForestEntity(0, "mallan", "goa", "430", "wet");
		ForestEntity entity8 = new ForestEntity(0, "abhishek", "kerala", "410", "desert");
		ForestEntity entity9 = new ForestEntity(0, "chetan", "telangana", "550", "desert");
		transaction.begin();
		//manager.persist(entity1);
		//manager.persist(entity2);
		//manager.persist(entity3);
		manager.persist(entity4);
		//manager.persist(entity5);
		//manager.persist(entity6);
		//manager.persist(entity7);
		//manager.persist(entity8);
		//manager.persist(entity9);
		transaction.commit();
		manager.close();
		
	}

}

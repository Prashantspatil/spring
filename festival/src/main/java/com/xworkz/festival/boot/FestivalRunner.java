package main.java.com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import main.java.com.xworkz.festival.entity.FestivalEntity;

public class FestivalRunner {

	public static void main(String[] args) {
		
		System.out.println("running FestivalRunner");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		FestivalEntity entity = new FestivalEntity("ramzan", "world", "surkumba", "allah", 1);
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();

	}

}

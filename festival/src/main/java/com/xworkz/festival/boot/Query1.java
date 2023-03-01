package main.java.com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main.java.com.xworkz.festival.entity.FestivalEntity;

public class Query1 {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByIdAndName");
		query.setParameter("pk", 2);
		query.setParameter("n", "holihabba");
		Object object = query.getSingleResult();
		FestivalEntity entity = (FestivalEntity) object;
		System.out.println(entity);
		
		Query query2 = manager.createNamedQuery("findByNameAndRegionAndMainGod");
		query2.setParameter("name", "mahanavami");
		query2.setParameter("r", "south");
		query2.setParameter("g", "chamundeshwari");
		Object object2 = query2.getSingleResult();
		FestivalEntity entity2 = (FestivalEntity) object2;
		System.out.println(entity2);
		
		Query query3 = manager.createNamedQuery("findByMainGod");
		query3.setParameter("g", "basavanna");
		Object object3 = query3.getSingleResult();
		FestivalEntity entity3 = (FestivalEntity) object3;
		System.out.println(entity3);
		
		Query query4 = manager.createNamedQuery("findTotalDaysByName");
		query4.setParameter("n", "mahanavami");
		Object object4 = query4.getSingleResult();
		int i =  (int) object4;
		System.out.println(i);
		
		Query query5 = manager.createNamedQuery("findRegionAndMainGodByNameAndId");
		query5.setParameter("n", "gandhijayanti");
		query5.setParameter("pk", 6);
		Object object5 = query5.getSingleResult();
		Object[] array =  (Object[]) object5;
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		Query query6 = manager.createNamedQuery("findMainGodAndTotalDaysByName");
		query6.setParameter("na", "hanumanjayanti");
		Object object6 = query6.getSingleResult();
		Object[] array1 =  (Object[]) object6;
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		
		Query query7 = manager.createNamedQuery("findTotal");
		Object object7 = query7.getSingleResult();
		long l =  (long) object7;
		System.out.println(l);

		Query query8 = manager.createNamedQuery("findMaxTo"
				+ "talDays");
		Object object8 = query8.getSingleResult();
		int x =  (int) object8;
		System.out.println(x);
		

		manager.close();

	}

}

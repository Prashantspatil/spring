package com.xworkz.aeroplane.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplane.entity.AeroplaneEntity;
@Repository
public class AeroplaneRepoImpl implements AeroplaneRepo {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public AeroplaneRepoImpl() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(AeroplaneEntity entity) {
		System.out.println("running save in repo impli");
		EntityManager em=this.entityManagerFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return false;
	}
	
	public AeroplaneEntity findById(int id) {
		System.out.println("find by id repo impli"+id);
		EntityManager manager=this.entityManagerFactory.createEntityManager();
		AeroplaneEntity fromDB=manager.find(AeroplaneEntity.class, id);
		manager.close();
		return fromDB;
	}

}

package com.xworkz.valentine.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentine.entity.ValentineEntity;
@Repository
public class ValentineRepoImpl implements ValentineRepo {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public ValentineRepoImpl() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(ValentineEntity valentineEntity) {
		System.out.println("running save repo impli");
		EntityManager em=this.entityManagerFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(valentineEntity);
		et.commit();
		em.close();
		return false;
	}

}

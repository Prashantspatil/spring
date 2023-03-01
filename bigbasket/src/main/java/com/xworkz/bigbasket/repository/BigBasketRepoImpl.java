package com.xworkz.bigbasket.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bigbasket.entity.BigBasketEntity;
@Repository
public class BigBasketRepoImpl implements BigBasketRepo {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public BigBasketRepoImpl() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(BigBasketEntity bigBasketEntity) {
		System.out.println("running save in repo impli");
		EntityManager em=this.entityManagerFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(bigBasketEntity);
		et.commit();
		em.close();
		return false;
	}
	
	public BigBasketEntity findByID(int id) {
		System.out.println("find by id in repo impli"+id);
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		BigBasketEntity fromDB=entityManager.find(BigBasketEntity.class, id);
		entityManager.close();
		return fromDB;
	}

}

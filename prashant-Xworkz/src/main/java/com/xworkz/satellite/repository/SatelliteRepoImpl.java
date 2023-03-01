package com.xworkz.satellite.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.satellite.entity.SatelliteEntity;
@Repository
public class SatelliteRepoImpl implements SatelliteRepo {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public SatelliteRepoImpl() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(SatelliteEntity entity) {
		System.out.println("running save in repo impli");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return false;
	}
	
	@Override
	public SatelliteEntity findById(int id) {
		System.out.println("running findById in repo impli"+id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		SatelliteEntity fromDb = manager.find(SatelliteEntity.class, id);
		manager.close();
		return fromDb;
	}
	
	@Override
	public List<SatelliteEntity> findByChairman(String chairman){
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByChairman");
			query.setParameter("man", chairman);
			List<SatelliteEntity> list = query.getResultList();
			System.out.println("total list found in repo"+list.size());
			return list;
		}finally {
			manager.close();
		}
	}

	@Override
	public boolean update(SatelliteEntity entity) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return true;
		}
		finally {
			manager.close();
		}
	}

	@Override
	public boolean delete(SatelliteEntity entity) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(entity);
			transaction.commit();
			return true;
		}
		finally {
			manager.close();
		}
	}

}

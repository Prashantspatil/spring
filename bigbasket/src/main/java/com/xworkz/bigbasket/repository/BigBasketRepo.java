package com.xworkz.bigbasket.repository;

import com.xworkz.bigbasket.entity.BigBasketEntity;

public interface BigBasketRepo {
	
	boolean save(BigBasketEntity bigBasketEntity);
	
	default BigBasketEntity findByID(int id) {
		System.out.println("running findByID in repo");
		return null;
	}

}

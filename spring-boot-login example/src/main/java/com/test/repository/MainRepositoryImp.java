package com.test.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.test.model.Main;

/**
 * @author Manoj kumar
 */

@Repository
@Transactional
public class MainRepositoryImp implements MainRepository {

	@PersistenceContext
    EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Main verify(Main main) {
		
		javax.persistence.Query quey = entityManager.createQuery(""
				+ "from Main m where m.email = :email and m.password = :password");
		quey.setParameter("email", main.getEmail());
		quey.setParameter("password", main.getPassword());
		List<Main> mains = quey.getResultList();
		
		if(!mains.isEmpty()){
			return mains.get(0);
		}
		
		return null;
	}
	
	
	
	
}

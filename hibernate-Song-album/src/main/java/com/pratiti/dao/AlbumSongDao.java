package com.pratiti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class AlbumSongDao {

	// Saving Customer Data in table
		public void save(Object object) {
			
			EntityManagerFactory emf = null;
		     try {
				
		    	emf = Persistence.createEntityManagerFactory("hibernate-demo");
		 		EntityManager em = emf.createEntityManager();
		    	 
		    	em.getTransaction().begin();
		 		
//		 		em.persist(object); //Persist generates insert query
		 		em.merge(object);   // merge generates update as well as insert query
//		 		em.remove(product);  // remove generates delete query
		 		
		 		em.getTransaction().commit();
		    	 
			} finally {
				emf.close();
			}
		}
		
		
		
		
		// Fetching data Of Customer by using pk
//		@SuppressWarnings({ "unchecked", "rawtypes" })
//		public Object fetchByIdV2(Class clazz,int id) {
//			EntityManagerFactory emf =null;
//			
//			try {
//				
//				emf = Persistence.createEntityManagerFactory("hibernate-demo");
//				EntityManager em = emf.createEntityManager();
//				
//				return em.find(clazz, id);
//				
//				
//			} finally {
//				emf.close();
//			}
//			
//		}
		
		public <E> E fetchById (Class <E> clazz,int id) {
			EntityManagerFactory emf =null;
			
			try {
				
				emf = Persistence.createEntityManagerFactory("hibernate-demo");
				EntityManager em = emf.createEntityManager();
				
				return em.find(clazz, id);
				
				
			} finally {
				emf.close();
			}
			
		}
		
		
		
		
		
	
}

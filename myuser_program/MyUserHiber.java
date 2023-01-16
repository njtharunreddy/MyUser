package myuser_program;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import student_hibernate.Student1;

public class MyUserHiber {
	public void signUp(MyUser user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		user.setId(user.getId());
		user.setUsername(user.getUsername());
		user.setEmail(user.getEmail());
		user.setPassword(user.getPassword());
		user.setAddress(user.getAddress());
		user.setFacebookPassword(user.getFacebookPassword());
		user.setInstaPassword(user.getInstaPassword());
		user.setSnapchatPassword(user.getSnapchatPassword());
		user.setWatsappPassword(user.getWatsappPassword());
		user.setTwiterPassword(user.getTwiterPassword());
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		System.out.println("Signed Up successfully");
	}
	public boolean login(int id,String password) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MyUser user=entityManager.find(MyUser.class,id);
	    if(password.equals(user.getPassword())) {
	    	return true;
	    	
	    }
	    return false;
	
	}

	public int updateFbPassword(int id,String facebookPassword) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MyUser user=entityManager.find(MyUser.class,id);
	    user.setFacebookPassword(facebookPassword);
	   
	    entityTransaction.begin();
	    entityManager.merge(user);
	    entityTransaction.commit();
		return id;
	}
	public int updateInstaPassword(int id,String InstaPassword) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MyUser user=entityManager.find(MyUser.class,id);
	    user.setInstaPassword(InstaPassword);
	   
	    entityTransaction.begin();
	    entityManager.merge(user);
	    entityTransaction.commit();
		return id;
	}
	public int updateSnapchatPassword(int id,String snapChatPassword) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MyUser user=entityManager.find(MyUser.class,id);
	    user.setSnapchatPassword(snapChatPassword);
	   
	    entityTransaction.begin();
	    entityManager.merge(user);
	    entityTransaction.commit();
		return id;
	}
	public int updateWatsappPassword(int id,String watsappPassword) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MyUser user=entityManager.find(MyUser.class,id);
	    user.setWatsappPassword(watsappPassword);
	   
	    entityTransaction.begin();
	    entityManager.merge(user);
	    entityTransaction.commit();
		return id;
	}
	public int updateTwiterPassword(int id,String twiterPassword) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MyUser user=entityManager.find(MyUser.class,id);
	    user.setTwiterPassword(twiterPassword);
	   
	    entityTransaction.begin();
	    entityManager.merge(user);
	    entityTransaction.commit();
		return id;
	}
		

}

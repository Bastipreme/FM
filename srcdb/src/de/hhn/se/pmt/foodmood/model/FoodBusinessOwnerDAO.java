/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: bastipreme(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.foodmood.model;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class FoodBusinessOwnerDAO {
	public static FoodBusinessOwner loadFoodBusinessOwnerByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadFoodBusinessOwnerByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusinessOwner getFoodBusinessOwnerByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return getFoodBusinessOwnerByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusinessOwner loadFoodBusinessOwnerByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadFoodBusinessOwnerByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusinessOwner getFoodBusinessOwnerByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return getFoodBusinessOwnerByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusinessOwner loadFoodBusinessOwnerByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (FoodBusinessOwner) session.load(de.hhn.se.pmt.foodmood.model.FoodBusinessOwner.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusinessOwner getFoodBusinessOwnerByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (FoodBusinessOwner) session.get(de.hhn.se.pmt.foodmood.model.FoodBusinessOwner.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusinessOwner loadFoodBusinessOwnerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (FoodBusinessOwner) session.load(de.hhn.se.pmt.foodmood.model.FoodBusinessOwner.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusinessOwner getFoodBusinessOwnerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (FoodBusinessOwner) session.get(de.hhn.se.pmt.foodmood.model.FoodBusinessOwner.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryFoodBusinessOwner(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return queryFoodBusinessOwner(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryFoodBusinessOwner(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return queryFoodBusinessOwner(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusinessOwner[] listFoodBusinessOwnerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return listFoodBusinessOwnerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusinessOwner[] listFoodBusinessOwnerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return listFoodBusinessOwnerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryFoodBusinessOwner(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.FoodBusinessOwner as FoodBusinessOwner");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryFoodBusinessOwner(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.FoodBusinessOwner as FoodBusinessOwner");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("FoodBusinessOwner", lockMode);
			return query.list();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusinessOwner[] listFoodBusinessOwnerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFoodBusinessOwner(session, condition, orderBy);
			return (FoodBusinessOwner[]) list.toArray(new FoodBusinessOwner[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusinessOwner[] listFoodBusinessOwnerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFoodBusinessOwner(session, condition, orderBy, lockMode);
			return (FoodBusinessOwner[]) list.toArray(new FoodBusinessOwner[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusinessOwner loadFoodBusinessOwnerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadFoodBusinessOwnerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusinessOwner loadFoodBusinessOwnerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadFoodBusinessOwnerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusinessOwner loadFoodBusinessOwnerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		FoodBusinessOwner[] foodBusinessOwners = listFoodBusinessOwnerByQuery(session, condition, orderBy);
		if (foodBusinessOwners != null && foodBusinessOwners.length > 0)
			return foodBusinessOwners[0];
		else
			return null;
	}
	
	public static FoodBusinessOwner loadFoodBusinessOwnerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		FoodBusinessOwner[] foodBusinessOwners = listFoodBusinessOwnerByQuery(session, condition, orderBy, lockMode);
		if (foodBusinessOwners != null && foodBusinessOwners.length > 0)
			return foodBusinessOwners[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFoodBusinessOwnerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return iterateFoodBusinessOwnerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFoodBusinessOwnerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return iterateFoodBusinessOwnerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFoodBusinessOwnerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.FoodBusinessOwner as FoodBusinessOwner");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFoodBusinessOwnerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.FoodBusinessOwner as FoodBusinessOwner");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("FoodBusinessOwner", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusinessOwner createFoodBusinessOwner() {
		return new de.hhn.se.pmt.foodmood.model.FoodBusinessOwner();
	}
	
	public static boolean save(de.hhn.se.pmt.foodmood.model.FoodBusinessOwner foodBusinessOwner) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().saveObject(foodBusinessOwner);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.se.pmt.foodmood.model.FoodBusinessOwner foodBusinessOwner) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().deleteObject(foodBusinessOwner);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.foodmood.model.FoodBusinessOwner foodBusinessOwner)throws PersistentException {
		try {
			if (foodBusinessOwner.getBusiness() != null) {
				foodBusinessOwner.getBusiness().setOwner(null);
			}
			
			de.hhn.se.pmt.foodmood.model.Dish[] lNewDishs = foodBusinessOwner.newDish.toArray();
			for(int i = 0; i < lNewDishs.length; i++) {
				lNewDishs[i].chef.remove(foodBusinessOwner);
			}
			return delete(foodBusinessOwner);
		}
		catch(Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.foodmood.model.FoodBusinessOwner foodBusinessOwner, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (foodBusinessOwner.getBusiness() != null) {
				foodBusinessOwner.getBusiness().setOwner(null);
			}
			
			de.hhn.se.pmt.foodmood.model.Dish[] lNewDishs = foodBusinessOwner.newDish.toArray();
			for(int i = 0; i < lNewDishs.length; i++) {
				lNewDishs[i].chef.remove(foodBusinessOwner);
			}
			try {
				session.delete(foodBusinessOwner);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(de.hhn.se.pmt.foodmood.model.FoodBusinessOwner foodBusinessOwner) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().getSession().refresh(foodBusinessOwner);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.se.pmt.foodmood.model.FoodBusinessOwner foodBusinessOwner) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().getSession().evict(foodBusinessOwner);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
}

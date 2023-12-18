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

public class FoodBusinessDAO {
	public static FoodBusiness loadFoodBusinessByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadFoodBusinessByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusiness getFoodBusinessByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return getFoodBusinessByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusiness loadFoodBusinessByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadFoodBusinessByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusiness getFoodBusinessByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return getFoodBusinessByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusiness loadFoodBusinessByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (FoodBusiness) session.load(de.hhn.se.pmt.foodmood.model.FoodBusiness.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusiness getFoodBusinessByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (FoodBusiness) session.get(de.hhn.se.pmt.foodmood.model.FoodBusiness.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusiness loadFoodBusinessByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (FoodBusiness) session.load(de.hhn.se.pmt.foodmood.model.FoodBusiness.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusiness getFoodBusinessByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (FoodBusiness) session.get(de.hhn.se.pmt.foodmood.model.FoodBusiness.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryFoodBusiness(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return queryFoodBusiness(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryFoodBusiness(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return queryFoodBusiness(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusiness[] listFoodBusinessByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return listFoodBusinessByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusiness[] listFoodBusinessByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return listFoodBusinessByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryFoodBusiness(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.FoodBusiness as FoodBusiness");
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
	
	public static List queryFoodBusiness(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.FoodBusiness as FoodBusiness");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("FoodBusiness", lockMode);
			return query.list();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusiness[] listFoodBusinessByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFoodBusiness(session, condition, orderBy);
			return (FoodBusiness[]) list.toArray(new FoodBusiness[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusiness[] listFoodBusinessByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFoodBusiness(session, condition, orderBy, lockMode);
			return (FoodBusiness[]) list.toArray(new FoodBusiness[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusiness loadFoodBusinessByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadFoodBusinessByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusiness loadFoodBusinessByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadFoodBusinessByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusiness loadFoodBusinessByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		FoodBusiness[] foodBusinesses = listFoodBusinessByQuery(session, condition, orderBy);
		if (foodBusinesses != null && foodBusinesses.length > 0)
			return foodBusinesses[0];
		else
			return null;
	}
	
	public static FoodBusiness loadFoodBusinessByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		FoodBusiness[] foodBusinesses = listFoodBusinessByQuery(session, condition, orderBy, lockMode);
		if (foodBusinesses != null && foodBusinesses.length > 0)
			return foodBusinesses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFoodBusinessByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return iterateFoodBusinessByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFoodBusinessByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return iterateFoodBusinessByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFoodBusinessByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.FoodBusiness as FoodBusiness");
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
	
	public static java.util.Iterator iterateFoodBusinessByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.FoodBusiness as FoodBusiness");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("FoodBusiness", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static FoodBusiness createFoodBusiness() {
		return new de.hhn.se.pmt.foodmood.model.FoodBusiness();
	}
	
	public static boolean save(de.hhn.se.pmt.foodmood.model.FoodBusiness foodBusiness) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().saveObject(foodBusiness);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.se.pmt.foodmood.model.FoodBusiness foodBusiness) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().deleteObject(foodBusiness);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.foodmood.model.FoodBusiness foodBusiness)throws PersistentException {
		try {
			if (foodBusiness.getBusinessLocation() != null) {
				foodBusiness.getBusinessLocation().theFoodBusiness.remove(foodBusiness);
			}
			
			if (foodBusiness.getOwner() != null) {
				foodBusiness.getOwner().setBusiness(null);
			}
			
			return delete(foodBusiness);
		}
		catch(Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.foodmood.model.FoodBusiness foodBusiness, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (foodBusiness.getBusinessLocation() != null) {
				foodBusiness.getBusinessLocation().theFoodBusiness.remove(foodBusiness);
			}
			
			if (foodBusiness.getOwner() != null) {
				foodBusiness.getOwner().setBusiness(null);
			}
			
			try {
				session.delete(foodBusiness);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(de.hhn.se.pmt.foodmood.model.FoodBusiness foodBusiness) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().getSession().refresh(foodBusiness);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.se.pmt.foodmood.model.FoodBusiness foodBusiness) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().getSession().evict(foodBusiness);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
}

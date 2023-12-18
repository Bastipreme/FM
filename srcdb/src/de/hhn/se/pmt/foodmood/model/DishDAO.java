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

public class DishDAO {
	public static Dish loadDishByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadDishByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Dish getDishByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return getDishByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Dish loadDishByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadDishByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Dish getDishByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return getDishByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Dish loadDishByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Dish) session.load(de.hhn.se.pmt.foodmood.model.Dish.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Dish getDishByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Dish) session.get(de.hhn.se.pmt.foodmood.model.Dish.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Dish loadDishByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Dish) session.load(de.hhn.se.pmt.foodmood.model.Dish.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Dish getDishByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Dish) session.get(de.hhn.se.pmt.foodmood.model.Dish.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryDish(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return queryDish(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryDish(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return queryDish(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Dish[] listDishByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return listDishByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Dish[] listDishByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return listDishByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryDish(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.Dish as Dish");
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
	
	public static List queryDish(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.Dish as Dish");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Dish", lockMode);
			return query.list();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Dish[] listDishByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDish(session, condition, orderBy);
			return (Dish[]) list.toArray(new Dish[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Dish[] listDishByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDish(session, condition, orderBy, lockMode);
			return (Dish[]) list.toArray(new Dish[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Dish loadDishByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadDishByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Dish loadDishByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadDishByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Dish loadDishByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Dish[] dishs = listDishByQuery(session, condition, orderBy);
		if (dishs != null && dishs.length > 0)
			return dishs[0];
		else
			return null;
	}
	
	public static Dish loadDishByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Dish[] dishs = listDishByQuery(session, condition, orderBy, lockMode);
		if (dishs != null && dishs.length > 0)
			return dishs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDishByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return iterateDishByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDishByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return iterateDishByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDishByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.Dish as Dish");
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
	
	public static java.util.Iterator iterateDishByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.Dish as Dish");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Dish", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Dish createDish() {
		return new de.hhn.se.pmt.foodmood.model.Dish();
	}
	
	public static boolean save(de.hhn.se.pmt.foodmood.model.Dish dish) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().saveObject(dish);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.se.pmt.foodmood.model.Dish dish) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().deleteObject(dish);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.foodmood.model.Dish dish)throws PersistentException {
		try {
			de.hhn.se.pmt.foodmood.model.FoodBusinessOwner[] lChefs = dish.chef.toArray();
			for(int i = 0; i < lChefs.length; i++) {
				lChefs[i].newDish.remove(dish);
			}
			if (dish.getTheHungryUser() != null) {
				dish.getTheHungryUser().desiredDish.remove(dish);
			}
			
			de.hhn.se.pmt.foodmood.model.Administrator[] lTheAdmins = dish.theAdmin.toArray();
			for(int i = 0; i < lTheAdmins.length; i++) {
				lTheAdmins[i].theDish.remove(dish);
			}
			if (dish.getInstruction() != null) {
				dish.getInstruction().setPreparableDish(null);
			}
			
			return delete(dish);
		}
		catch(Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.foodmood.model.Dish dish, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.se.pmt.foodmood.model.FoodBusinessOwner[] lChefs = dish.chef.toArray();
			for(int i = 0; i < lChefs.length; i++) {
				lChefs[i].newDish.remove(dish);
			}
			if (dish.getTheHungryUser() != null) {
				dish.getTheHungryUser().desiredDish.remove(dish);
			}
			
			de.hhn.se.pmt.foodmood.model.Administrator[] lTheAdmins = dish.theAdmin.toArray();
			for(int i = 0; i < lTheAdmins.length; i++) {
				lTheAdmins[i].theDish.remove(dish);
			}
			if (dish.getInstruction() != null) {
				dish.getInstruction().setPreparableDish(null);
			}
			
			try {
				session.delete(dish);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(de.hhn.se.pmt.foodmood.model.Dish dish) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().getSession().refresh(dish);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.se.pmt.foodmood.model.Dish dish) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().getSession().evict(dish);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
}

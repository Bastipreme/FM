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

public class HungryUserDAO {
	public static HungryUser loadHungryUserByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadHungryUserByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static HungryUser getHungryUserByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return getHungryUserByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static HungryUser loadHungryUserByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadHungryUserByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static HungryUser getHungryUserByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return getHungryUserByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static HungryUser loadHungryUserByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (HungryUser) session.load(de.hhn.se.pmt.foodmood.model.HungryUser.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static HungryUser getHungryUserByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (HungryUser) session.get(de.hhn.se.pmt.foodmood.model.HungryUser.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static HungryUser loadHungryUserByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (HungryUser) session.load(de.hhn.se.pmt.foodmood.model.HungryUser.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static HungryUser getHungryUserByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (HungryUser) session.get(de.hhn.se.pmt.foodmood.model.HungryUser.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryHungryUser(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return queryHungryUser(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryHungryUser(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return queryHungryUser(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static HungryUser[] listHungryUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return listHungryUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static HungryUser[] listHungryUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return listHungryUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryHungryUser(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.HungryUser as HungryUser");
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
	
	public static List queryHungryUser(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.HungryUser as HungryUser");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("HungryUser", lockMode);
			return query.list();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static HungryUser[] listHungryUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHungryUser(session, condition, orderBy);
			return (HungryUser[]) list.toArray(new HungryUser[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static HungryUser[] listHungryUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryHungryUser(session, condition, orderBy, lockMode);
			return (HungryUser[]) list.toArray(new HungryUser[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static HungryUser loadHungryUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadHungryUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static HungryUser loadHungryUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadHungryUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static HungryUser loadHungryUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		HungryUser[] hungryUsers = listHungryUserByQuery(session, condition, orderBy);
		if (hungryUsers != null && hungryUsers.length > 0)
			return hungryUsers[0];
		else
			return null;
	}
	
	public static HungryUser loadHungryUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		HungryUser[] hungryUsers = listHungryUserByQuery(session, condition, orderBy, lockMode);
		if (hungryUsers != null && hungryUsers.length > 0)
			return hungryUsers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHungryUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return iterateHungryUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHungryUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return iterateHungryUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHungryUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.HungryUser as HungryUser");
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
	
	public static java.util.Iterator iterateHungryUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.HungryUser as HungryUser");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("HungryUser", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static HungryUser createHungryUser() {
		return new de.hhn.se.pmt.foodmood.model.HungryUser();
	}
	
	public static boolean save(de.hhn.se.pmt.foodmood.model.HungryUser hungryUser) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().saveObject(hungryUser);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.se.pmt.foodmood.model.HungryUser hungryUser) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().deleteObject(hungryUser);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.foodmood.model.HungryUser hungryUser)throws PersistentException {
		try {
			if (hungryUser.getUserLocation() != null) {
				hungryUser.getUserLocation().theHungryUser.remove(hungryUser);
			}
			
			de.hhn.se.pmt.foodmood.model.Reminder[] lTheReminders = hungryUser.theReminder.toArray();
			for(int i = 0; i < lTheReminders.length; i++) {
				lTheReminders[i].setRemindableUser(null);
			}
			de.hhn.se.pmt.foodmood.model.Dish[] lDesiredDishs = hungryUser.desiredDish.toArray();
			for(int i = 0; i < lDesiredDishs.length; i++) {
				lDesiredDishs[i].setTheHungryUser(null);
			}
			return delete(hungryUser);
		}
		catch(Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.foodmood.model.HungryUser hungryUser, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (hungryUser.getUserLocation() != null) {
				hungryUser.getUserLocation().theHungryUser.remove(hungryUser);
			}
			
			de.hhn.se.pmt.foodmood.model.Reminder[] lTheReminders = hungryUser.theReminder.toArray();
			for(int i = 0; i < lTheReminders.length; i++) {
				lTheReminders[i].setRemindableUser(null);
			}
			de.hhn.se.pmt.foodmood.model.Dish[] lDesiredDishs = hungryUser.desiredDish.toArray();
			for(int i = 0; i < lDesiredDishs.length; i++) {
				lDesiredDishs[i].setTheHungryUser(null);
			}
			try {
				session.delete(hungryUser);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(de.hhn.se.pmt.foodmood.model.HungryUser hungryUser) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().getSession().refresh(hungryUser);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.se.pmt.foodmood.model.HungryUser hungryUser) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().getSession().evict(hungryUser);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
}

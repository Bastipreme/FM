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

public class LocationDAO {
	public static Location loadLocationByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadLocationByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Location getLocationByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return getLocationByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Location loadLocationByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadLocationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Location getLocationByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return getLocationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Location loadLocationByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Location) session.load(de.hhn.se.pmt.foodmood.model.Location.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Location getLocationByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Location) session.get(de.hhn.se.pmt.foodmood.model.Location.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Location loadLocationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Location) session.load(de.hhn.se.pmt.foodmood.model.Location.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Location getLocationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Location) session.get(de.hhn.se.pmt.foodmood.model.Location.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryLocation(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return queryLocation(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryLocation(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return queryLocation(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Location[] listLocationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return listLocationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Location[] listLocationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return listLocationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryLocation(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.Location as Location");
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
	
	public static List queryLocation(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.Location as Location");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Location", lockMode);
			return query.list();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Location[] listLocationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLocation(session, condition, orderBy);
			return (Location[]) list.toArray(new Location[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Location[] listLocationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLocation(session, condition, orderBy, lockMode);
			return (Location[]) list.toArray(new Location[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Location loadLocationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadLocationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Location loadLocationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadLocationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Location loadLocationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Location[] locations = listLocationByQuery(session, condition, orderBy);
		if (locations != null && locations.length > 0)
			return locations[0];
		else
			return null;
	}
	
	public static Location loadLocationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Location[] locations = listLocationByQuery(session, condition, orderBy, lockMode);
		if (locations != null && locations.length > 0)
			return locations[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLocationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return iterateLocationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLocationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return iterateLocationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLocationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.Location as Location");
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
	
	public static java.util.Iterator iterateLocationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.Location as Location");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Location", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Location createLocation() {
		return new de.hhn.se.pmt.foodmood.model.Location();
	}
	
	public static boolean save(de.hhn.se.pmt.foodmood.model.Location location) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().saveObject(location);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.se.pmt.foodmood.model.Location location) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().deleteObject(location);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.foodmood.model.Location location)throws PersistentException {
		try {
			de.hhn.se.pmt.foodmood.model.FoodBusiness[] lTheFoodBusinesss = location.theFoodBusiness.toArray();
			for(int i = 0; i < lTheFoodBusinesss.length; i++) {
				lTheFoodBusinesss[i].setBusinessLocation(null);
			}
			de.hhn.se.pmt.foodmood.model.HungryUser[] lTheHungryUsers = location.theHungryUser.toArray();
			for(int i = 0; i < lTheHungryUsers.length; i++) {
				lTheHungryUsers[i].setUserLocation(null);
			}
			return delete(location);
		}
		catch(Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.foodmood.model.Location location, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.se.pmt.foodmood.model.FoodBusiness[] lTheFoodBusinesss = location.theFoodBusiness.toArray();
			for(int i = 0; i < lTheFoodBusinesss.length; i++) {
				lTheFoodBusinesss[i].setBusinessLocation(null);
			}
			de.hhn.se.pmt.foodmood.model.HungryUser[] lTheHungryUsers = location.theHungryUser.toArray();
			for(int i = 0; i < lTheHungryUsers.length; i++) {
				lTheHungryUsers[i].setUserLocation(null);
			}
			try {
				session.delete(location);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(de.hhn.se.pmt.foodmood.model.Location location) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().getSession().refresh(location);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.se.pmt.foodmood.model.Location location) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().getSession().evict(location);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
}

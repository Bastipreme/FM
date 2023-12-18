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

public class ReminderDAO {
	public static Reminder loadReminderByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadReminderByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Reminder getReminderByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return getReminderByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Reminder loadReminderByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadReminderByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Reminder getReminderByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return getReminderByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Reminder loadReminderByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Reminder) session.load(de.hhn.se.pmt.foodmood.model.Reminder.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Reminder getReminderByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Reminder) session.get(de.hhn.se.pmt.foodmood.model.Reminder.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Reminder loadReminderByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reminder) session.load(de.hhn.se.pmt.foodmood.model.Reminder.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Reminder getReminderByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reminder) session.get(de.hhn.se.pmt.foodmood.model.Reminder.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryReminder(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return queryReminder(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryReminder(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return queryReminder(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Reminder[] listReminderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return listReminderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Reminder[] listReminderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return listReminderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryReminder(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.Reminder as Reminder");
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
	
	public static List queryReminder(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.Reminder as Reminder");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reminder", lockMode);
			return query.list();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Reminder[] listReminderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryReminder(session, condition, orderBy);
			return (Reminder[]) list.toArray(new Reminder[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Reminder[] listReminderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryReminder(session, condition, orderBy, lockMode);
			return (Reminder[]) list.toArray(new Reminder[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Reminder loadReminderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadReminderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Reminder loadReminderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadReminderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Reminder loadReminderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Reminder[] reminders = listReminderByQuery(session, condition, orderBy);
		if (reminders != null && reminders.length > 0)
			return reminders[0];
		else
			return null;
	}
	
	public static Reminder loadReminderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Reminder[] reminders = listReminderByQuery(session, condition, orderBy, lockMode);
		if (reminders != null && reminders.length > 0)
			return reminders[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateReminderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return iterateReminderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReminderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return iterateReminderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReminderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.Reminder as Reminder");
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
	
	public static java.util.Iterator iterateReminderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.Reminder as Reminder");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reminder", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Reminder createReminder() {
		return new de.hhn.se.pmt.foodmood.model.Reminder();
	}
	
	public static boolean save(de.hhn.se.pmt.foodmood.model.Reminder reminder) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().saveObject(reminder);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.se.pmt.foodmood.model.Reminder reminder) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().deleteObject(reminder);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.foodmood.model.Reminder reminder)throws PersistentException {
		try {
			if (reminder.getRemindableUser() != null) {
				reminder.getRemindableUser().theReminder.remove(reminder);
			}
			
			return delete(reminder);
		}
		catch(Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.foodmood.model.Reminder reminder, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (reminder.getRemindableUser() != null) {
				reminder.getRemindableUser().theReminder.remove(reminder);
			}
			
			try {
				session.delete(reminder);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(de.hhn.se.pmt.foodmood.model.Reminder reminder) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().getSession().refresh(reminder);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.se.pmt.foodmood.model.Reminder reminder) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().getSession().evict(reminder);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
}

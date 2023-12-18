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

public class RecipeDAO {
	public static Recipe loadRecipeByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadRecipeByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Recipe getRecipeByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return getRecipeByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Recipe loadRecipeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadRecipeByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Recipe getRecipeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return getRecipeByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Recipe loadRecipeByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Recipe) session.load(de.hhn.se.pmt.foodmood.model.Recipe.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Recipe getRecipeByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Recipe) session.get(de.hhn.se.pmt.foodmood.model.Recipe.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Recipe loadRecipeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Recipe) session.load(de.hhn.se.pmt.foodmood.model.Recipe.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Recipe getRecipeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Recipe) session.get(de.hhn.se.pmt.foodmood.model.Recipe.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryRecipe(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return queryRecipe(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryRecipe(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return queryRecipe(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Recipe[] listRecipeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return listRecipeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Recipe[] listRecipeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return listRecipeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryRecipe(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.Recipe as Recipe");
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
	
	public static List queryRecipe(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.Recipe as Recipe");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Recipe", lockMode);
			return query.list();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Recipe[] listRecipeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRecipe(session, condition, orderBy);
			return (Recipe[]) list.toArray(new Recipe[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Recipe[] listRecipeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryRecipe(session, condition, orderBy, lockMode);
			return (Recipe[]) list.toArray(new Recipe[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Recipe loadRecipeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadRecipeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Recipe loadRecipeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return loadRecipeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Recipe loadRecipeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Recipe[] recipes = listRecipeByQuery(session, condition, orderBy);
		if (recipes != null && recipes.length > 0)
			return recipes[0];
		else
			return null;
	}
	
	public static Recipe loadRecipeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Recipe[] recipes = listRecipeByQuery(session, condition, orderBy, lockMode);
		if (recipes != null && recipes.length > 0)
			return recipes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRecipeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return iterateRecipeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRecipeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = FoodMoodPersistentManager.instance().getSession();
			return iterateRecipeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRecipeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.Recipe as Recipe");
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
	
	public static java.util.Iterator iterateRecipeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.foodmood.model.Recipe as Recipe");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Recipe", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static Recipe createRecipe() {
		return new de.hhn.se.pmt.foodmood.model.Recipe();
	}
	
	public static boolean save(de.hhn.se.pmt.foodmood.model.Recipe recipe) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().saveObject(recipe);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.se.pmt.foodmood.model.Recipe recipe) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().deleteObject(recipe);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.foodmood.model.Recipe recipe)throws PersistentException {
		try {
			if (recipe.getPreparableDish() != null) {
				recipe.getPreparableDish().setInstruction(null);
			}
			
			return delete(recipe);
		}
		catch(Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.foodmood.model.Recipe recipe, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (recipe.getPreparableDish() != null) {
				recipe.getPreparableDish().setInstruction(null);
			}
			
			try {
				session.delete(recipe);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(de.hhn.se.pmt.foodmood.model.Recipe recipe) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().getSession().refresh(recipe);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.se.pmt.foodmood.model.Recipe recipe) throws PersistentException {
		try {
			FoodMoodPersistentManager.instance().getSession().evict(recipe);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
}

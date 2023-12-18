/**
 * Licensee: bastipreme(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListFoodMoodData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing HungryUser...");
		de.hhn.se.pmt.foodmood.model.HungryUser[] dehhnsepmtfoodmoodmodelHungryUsers = de.hhn.se.pmt.foodmood.model.HungryUserDAO.listHungryUserByQuery(null, null);
		int length = Math.min(dehhnsepmtfoodmoodmodelHungryUsers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtfoodmoodmodelHungryUsers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrator...");
		de.hhn.se.pmt.foodmood.model.Administrator[] dehhnsepmtfoodmoodmodelAdministrators = de.hhn.se.pmt.foodmood.model.AdministratorDAO.listAdministratorByQuery(null, null);
		length = Math.min(dehhnsepmtfoodmoodmodelAdministrators.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtfoodmoodmodelAdministrators[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Reminder...");
		de.hhn.se.pmt.foodmood.model.Reminder[] dehhnsepmtfoodmoodmodelReminders = de.hhn.se.pmt.foodmood.model.ReminderDAO.listReminderByQuery(null, null);
		length = Math.min(dehhnsepmtfoodmoodmodelReminders.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtfoodmoodmodelReminders[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing FoodBusinessOwner...");
		de.hhn.se.pmt.foodmood.model.FoodBusinessOwner[] dehhnsepmtfoodmoodmodelFoodBusinessOwners = de.hhn.se.pmt.foodmood.model.FoodBusinessOwnerDAO.listFoodBusinessOwnerByQuery(null, null);
		length = Math.min(dehhnsepmtfoodmoodmodelFoodBusinessOwners.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtfoodmoodmodelFoodBusinessOwners[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Dish...");
		de.hhn.se.pmt.foodmood.model.Dish[] dehhnsepmtfoodmoodmodelDishs = de.hhn.se.pmt.foodmood.model.DishDAO.listDishByQuery(null, null);
		length = Math.min(dehhnsepmtfoodmoodmodelDishs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtfoodmoodmodelDishs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Rate...");
		de.hhn.se.pmt.foodmood.model.Rate[] dehhnsepmtfoodmoodmodelRates = de.hhn.se.pmt.foodmood.model.RateDAO.listRateByQuery(null, null);
		length = Math.min(dehhnsepmtfoodmoodmodelRates.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtfoodmoodmodelRates[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Recipe...");
		de.hhn.se.pmt.foodmood.model.Recipe[] dehhnsepmtfoodmoodmodelRecipes = de.hhn.se.pmt.foodmood.model.RecipeDAO.listRecipeByQuery(null, null);
		length = Math.min(dehhnsepmtfoodmoodmodelRecipes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtfoodmoodmodelRecipes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Location...");
		de.hhn.se.pmt.foodmood.model.Location[] dehhnsepmtfoodmoodmodelLocations = de.hhn.se.pmt.foodmood.model.LocationDAO.listLocationByQuery(null, null);
		length = Math.min(dehhnsepmtfoodmoodmodelLocations.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtfoodmoodmodelLocations[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing FoodBusiness...");
		de.hhn.se.pmt.foodmood.model.FoodBusiness[] dehhnsepmtfoodmoodmodelFoodBusinesses = de.hhn.se.pmt.foodmood.model.FoodBusinessDAO.listFoodBusinessByQuery(null, null);
		length = Math.min(dehhnsepmtfoodmoodmodelFoodBusinesses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtfoodmoodmodelFoodBusinesses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListFoodMoodData listFoodMoodData = new ListFoodMoodData();
			try {
				listFoodMoodData.listTestData();
			}
			finally {
				de.hhn.se.pmt.foodmood.model.FoodMoodPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

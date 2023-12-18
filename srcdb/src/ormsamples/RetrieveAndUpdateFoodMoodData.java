/**
 * Licensee: bastipreme(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateFoodMoodData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.se.pmt.foodmood.model.FoodMoodPersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.se.pmt.foodmood.model.HungryUser ldehhnsepmtfoodmoodmodelHungryUser = de.hhn.se.pmt.foodmood.model.HungryUserDAO.loadHungryUserByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.se.pmt.foodmood.model.HungryUserDAO.save(ldehhnsepmtfoodmoodmodelHungryUser);
			de.hhn.se.pmt.foodmood.model.Administrator ldehhnsepmtfoodmoodmodelAdministrator = de.hhn.se.pmt.foodmood.model.AdministratorDAO.loadAdministratorByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.se.pmt.foodmood.model.AdministratorDAO.save(ldehhnsepmtfoodmoodmodelAdministrator);
			de.hhn.se.pmt.foodmood.model.Reminder ldehhnsepmtfoodmoodmodelReminder = de.hhn.se.pmt.foodmood.model.ReminderDAO.loadReminderByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.se.pmt.foodmood.model.ReminderDAO.save(ldehhnsepmtfoodmoodmodelReminder);
			de.hhn.se.pmt.foodmood.model.FoodBusinessOwner ldehhnsepmtfoodmoodmodelFoodBusinessOwner = de.hhn.se.pmt.foodmood.model.FoodBusinessOwnerDAO.loadFoodBusinessOwnerByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.se.pmt.foodmood.model.FoodBusinessOwnerDAO.save(ldehhnsepmtfoodmoodmodelFoodBusinessOwner);
			de.hhn.se.pmt.foodmood.model.Dish ldehhnsepmtfoodmoodmodelDish = de.hhn.se.pmt.foodmood.model.DishDAO.loadDishByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.se.pmt.foodmood.model.DishDAO.save(ldehhnsepmtfoodmoodmodelDish);
			de.hhn.se.pmt.foodmood.model.Rate ldehhnsepmtfoodmoodmodelRate = de.hhn.se.pmt.foodmood.model.RateDAO.loadRateByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.se.pmt.foodmood.model.RateDAO.save(ldehhnsepmtfoodmoodmodelRate);
			de.hhn.se.pmt.foodmood.model.Recipe ldehhnsepmtfoodmoodmodelRecipe = de.hhn.se.pmt.foodmood.model.RecipeDAO.loadRecipeByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.se.pmt.foodmood.model.RecipeDAO.save(ldehhnsepmtfoodmoodmodelRecipe);
			de.hhn.se.pmt.foodmood.model.Location ldehhnsepmtfoodmoodmodelLocation = de.hhn.se.pmt.foodmood.model.LocationDAO.loadLocationByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.se.pmt.foodmood.model.LocationDAO.save(ldehhnsepmtfoodmoodmodelLocation);
			de.hhn.se.pmt.foodmood.model.FoodBusiness ldehhnsepmtfoodmoodmodelFoodBusiness = de.hhn.se.pmt.foodmood.model.FoodBusinessDAO.loadFoodBusinessByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.se.pmt.foodmood.model.FoodBusinessDAO.save(ldehhnsepmtfoodmoodmodelFoodBusiness);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateFoodMoodData retrieveAndUpdateFoodMoodData = new RetrieveAndUpdateFoodMoodData();
			try {
				retrieveAndUpdateFoodMoodData.retrieveAndUpdateTestData();
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

/**
 * Licensee: bastipreme(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteFoodMoodData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.se.pmt.foodmood.model.FoodMoodPersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.se.pmt.foodmood.model.HungryUser ldehhnsepmtfoodmoodmodelHungryUser = de.hhn.se.pmt.foodmood.model.HungryUserDAO.loadHungryUserByQuery(null, null);
			// Delete the persistent object
			de.hhn.se.pmt.foodmood.model.HungryUserDAO.delete(ldehhnsepmtfoodmoodmodelHungryUser);
			de.hhn.se.pmt.foodmood.model.Administrator ldehhnsepmtfoodmoodmodelAdministrator = de.hhn.se.pmt.foodmood.model.AdministratorDAO.loadAdministratorByQuery(null, null);
			// Delete the persistent object
			de.hhn.se.pmt.foodmood.model.AdministratorDAO.delete(ldehhnsepmtfoodmoodmodelAdministrator);
			de.hhn.se.pmt.foodmood.model.Reminder ldehhnsepmtfoodmoodmodelReminder = de.hhn.se.pmt.foodmood.model.ReminderDAO.loadReminderByQuery(null, null);
			// Delete the persistent object
			de.hhn.se.pmt.foodmood.model.ReminderDAO.delete(ldehhnsepmtfoodmoodmodelReminder);
			de.hhn.se.pmt.foodmood.model.FoodBusinessOwner ldehhnsepmtfoodmoodmodelFoodBusinessOwner = de.hhn.se.pmt.foodmood.model.FoodBusinessOwnerDAO.loadFoodBusinessOwnerByQuery(null, null);
			// Delete the persistent object
			de.hhn.se.pmt.foodmood.model.FoodBusinessOwnerDAO.delete(ldehhnsepmtfoodmoodmodelFoodBusinessOwner);
			de.hhn.se.pmt.foodmood.model.Dish ldehhnsepmtfoodmoodmodelDish = de.hhn.se.pmt.foodmood.model.DishDAO.loadDishByQuery(null, null);
			// Delete the persistent object
			de.hhn.se.pmt.foodmood.model.DishDAO.delete(ldehhnsepmtfoodmoodmodelDish);
			de.hhn.se.pmt.foodmood.model.Rate ldehhnsepmtfoodmoodmodelRate = de.hhn.se.pmt.foodmood.model.RateDAO.loadRateByQuery(null, null);
			// Delete the persistent object
			de.hhn.se.pmt.foodmood.model.RateDAO.delete(ldehhnsepmtfoodmoodmodelRate);
			de.hhn.se.pmt.foodmood.model.Recipe ldehhnsepmtfoodmoodmodelRecipe = de.hhn.se.pmt.foodmood.model.RecipeDAO.loadRecipeByQuery(null, null);
			// Delete the persistent object
			de.hhn.se.pmt.foodmood.model.RecipeDAO.delete(ldehhnsepmtfoodmoodmodelRecipe);
			de.hhn.se.pmt.foodmood.model.Location ldehhnsepmtfoodmoodmodelLocation = de.hhn.se.pmt.foodmood.model.LocationDAO.loadLocationByQuery(null, null);
			// Delete the persistent object
			de.hhn.se.pmt.foodmood.model.LocationDAO.delete(ldehhnsepmtfoodmoodmodelLocation);
			de.hhn.se.pmt.foodmood.model.FoodBusiness ldehhnsepmtfoodmoodmodelFoodBusiness = de.hhn.se.pmt.foodmood.model.FoodBusinessDAO.loadFoodBusinessByQuery(null, null);
			// Delete the persistent object
			de.hhn.se.pmt.foodmood.model.FoodBusinessDAO.delete(ldehhnsepmtfoodmoodmodelFoodBusiness);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteFoodMoodData deleteFoodMoodData = new DeleteFoodMoodData();
			try {
				deleteFoodMoodData.deleteTestData();
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

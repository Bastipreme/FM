/**
 * Licensee: bastipreme(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateFoodMoodData {
	public void createTestData() throws PersistentException {
		// Insert sample data
		PersistentSession session = de.hhn.se.pmt.foodmood.model.FoodMoodPersistentManager.instance().getSession();
		PersistentTransaction transaction = session.beginTransaction();
		try {
			session.doWork(new org.hibernate.jdbc.Work() {
				public void execute(java.sql.Connection conn) throws java.sql.SQLException {
					java.sql.Statement statement = conn.createStatement();
					statement.executeUpdate("INSERT INTO Location(Plz, City, Latitude, Longtitude) VALUES (74081, 'Heilbronn', 49.150002, 9.2166)");
					statement.executeUpdate("INSERT INTO Location(Plz, City, Latitude, Longtitude) VALUES (74172, 'Neckarsulm', 49.192258, 9.228709)");
					statement.executeUpdate("INSERT INTO Location(Plz, City, Latitude, Longtitude) VALUES (20019, 'Mailand', 45.464664, 9.18854)");
					statement.executeUpdate("INSERT INTO FoodBusiness(LocationID, BusinessName) VALUES (2, 'Peters Dönerbude')");
					statement.executeUpdate("INSERT INTO FoodBusiness(LocationID, BusinessName) VALUES (3, 'Mario Restaurant')");
					statement.executeUpdate("INSERT INTO `User`(FoodBusinessID, LocationID, Name, Password, PhoneNumber, Address, Discriminator) VALUES (null, 1, 'Johann Schmidt', 'helloworld', '017615486262', null, 'HungryUser')");
					statement.executeUpdate("INSERT INTO `User`(FoodBusinessID, LocationID, Name, Password, PhoneNumber, Address, Discriminator) VALUES (1, 2, 'Peter Zimmermann', 'döner', '017651959861', null, 'FoodBusinessOwner')");
					statement.executeUpdate("INSERT INTO `User`(FoodBusinessID, LocationID, Name, Password, PhoneNumber, Address, Discriminator) VALUES (2, 3, 'Mario Zaniolo', 'italian0123', '396156548841', null, 'FoodBusinessOwner')");
					statement.executeUpdate("INSERT INTO `User`(FoodBusinessID, LocationID, Name, Password, PhoneNumber, Address, Discriminator) VALUES (null, null, 'Hans Klaus', 'admin456', '017681916518', null, 'Administrator')");
					statement.executeUpdate("INSERT INTO Rate(Rating, Comment) VALUES (5, null)");
					statement.executeUpdate("INSERT INTO Dish(UserID, Title, Description, Recipe) VALUES (2, 'Döner', 'Fladenbrot mit Gemüse/Fleisch', null)");
					statement.executeUpdate("INSERT INTO Dish(UserID, Title, Description, Recipe) VALUES (3, 'Bruschetta', 'Brot mit Tomaten und Basilikum', null)");
					statement.executeUpdate("INSERT INTO Dish(UserID, Title, Description, Recipe) VALUES (3, 'Pizza Mozzarella', 'Mozzarella-Pizza', null)");
					statement.executeUpdate("INSERT INTO Dish(UserID, Title, Description, Recipe) VALUES (3, 'Spaghetti Carbonara', 'Spaghetti mit Käsesauce', null)");
					statement.executeUpdate("INSERT INTO Dish(UserID, Title, Description, Recipe) VALUES (3, 'Pasta rot', 'Pasta mit Tomatensauce', null)");
					statement.executeUpdate("INSERT INTO Reminder(UserID, HourOfReminder, Validated, Occurrence) VALUES (1, null, 0, null)");
					statement.executeUpdate("INSERT INTO Recipe(DishID, Content) VALUES (1, null)");
					statement.executeUpdate("INSERT INTO Recipe(DishID, Content) VALUES (2, null)");
					statement.executeUpdate("INSERT INTO Recipe(DishID, Content) VALUES (3, null)");
					statement.executeUpdate("INSERT INTO Recipe(DishID, Content) VALUES (4, null)");
					statement.executeUpdate("INSERT INTO Recipe(DishID, Content) VALUES (5, null)");
					statement.executeUpdate("INSERT INTO User_Dish2(UserID, DishID) VALUES (2, 1)");
					statement.executeUpdate("INSERT INTO User_Dish2(UserID, DishID) VALUES (3, 2)");
					statement.executeUpdate("INSERT INTO User_Dish2(UserID, DishID) VALUES (3, 3)");
					statement.executeUpdate("INSERT INTO User_Dish2(UserID, DishID) VALUES (3, 4)");
					statement.executeUpdate("INSERT INTO User_Dish2(UserID, DishID) VALUES (3, 5)");
					statement.executeUpdate("INSERT INTO User_Dish3(UserID, DishID) VALUES (4, 1)");
					statement.close();
				}
			});
			transaction.commit();
		}
		catch (Exception e) {
			try {
				transaction.rollback();
			}
			catch (PersistentException e1) {
				e.printStackTrace();
			}
			e.printStackTrace();
		}
		
		PersistentTransaction t = de.hhn.se.pmt.foodmood.model.FoodMoodPersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.se.pmt.foodmood.model.HungryUser ldehhnsepmtfoodmoodmodelHungryUser = de.hhn.se.pmt.foodmood.model.HungryUserDAO.createHungryUser();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : theReminder
			de.hhn.se.pmt.foodmood.model.HungryUserDAO.save(ldehhnsepmtfoodmoodmodelHungryUser);
			de.hhn.se.pmt.foodmood.model.Administrator ldehhnsepmtfoodmoodmodelAdministrator = de.hhn.se.pmt.foodmood.model.AdministratorDAO.createAdministrator();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : theDish
			de.hhn.se.pmt.foodmood.model.AdministratorDAO.save(ldehhnsepmtfoodmoodmodelAdministrator);
			de.hhn.se.pmt.foodmood.model.Reminder ldehhnsepmtfoodmoodmodelReminder = de.hhn.se.pmt.foodmood.model.ReminderDAO.createReminder();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : validated, remindableUser
			de.hhn.se.pmt.foodmood.model.ReminderDAO.save(ldehhnsepmtfoodmoodmodelReminder);
			de.hhn.se.pmt.foodmood.model.FoodBusinessOwner ldehhnsepmtfoodmoodmodelFoodBusinessOwner = de.hhn.se.pmt.foodmood.model.FoodBusinessOwnerDAO.createFoodBusinessOwner();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : newDish
			de.hhn.se.pmt.foodmood.model.FoodBusinessOwnerDAO.save(ldehhnsepmtfoodmoodmodelFoodBusinessOwner);
			de.hhn.se.pmt.foodmood.model.Dish ldehhnsepmtfoodmoodmodelDish = de.hhn.se.pmt.foodmood.model.DishDAO.createDish();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : instruction, theAdmin, chef
			de.hhn.se.pmt.foodmood.model.DishDAO.save(ldehhnsepmtfoodmoodmodelDish);
			de.hhn.se.pmt.foodmood.model.Rate ldehhnsepmtfoodmoodmodelRate = de.hhn.se.pmt.foodmood.model.RateDAO.createRate();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : rating
			de.hhn.se.pmt.foodmood.model.RateDAO.save(ldehhnsepmtfoodmoodmodelRate);
			de.hhn.se.pmt.foodmood.model.Recipe ldehhnsepmtfoodmoodmodelRecipe = de.hhn.se.pmt.foodmood.model.RecipeDAO.createRecipe();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : preparableDish
			de.hhn.se.pmt.foodmood.model.RecipeDAO.save(ldehhnsepmtfoodmoodmodelRecipe);
			de.hhn.se.pmt.foodmood.model.Location ldehhnsepmtfoodmoodmodelLocation = de.hhn.se.pmt.foodmood.model.LocationDAO.createLocation();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : theFoodBusiness, longtitude, latitude, plz
			de.hhn.se.pmt.foodmood.model.LocationDAO.save(ldehhnsepmtfoodmoodmodelLocation);
			de.hhn.se.pmt.foodmood.model.FoodBusiness ldehhnsepmtfoodmoodmodelFoodBusiness = de.hhn.se.pmt.foodmood.model.FoodBusinessDAO.createFoodBusiness();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : businessLocation
			de.hhn.se.pmt.foodmood.model.FoodBusinessDAO.save(ldehhnsepmtfoodmoodmodelFoodBusiness);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateFoodMoodData createFoodMoodData = new CreateFoodMoodData();
			try {
				createFoodMoodData.createTestData();
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

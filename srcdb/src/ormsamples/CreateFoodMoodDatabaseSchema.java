/**
 * Licensee: bastipreme(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateFoodMoodDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(de.hhn.se.pmt.foodmood.model.FoodMoodPersistentManager.instance());
			de.hhn.se.pmt.foodmood.model.FoodMoodPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

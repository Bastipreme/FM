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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("HungryUser")
public class HungryUser extends de.hhn.se.pmt.foodmood.model.User implements Serializable {
	public HungryUser() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_HUNGRYUSER_THEREMINDER) {
			return ORM_theReminder;
		}
		else if (key == ORMConstants.KEY_HUNGRYUSER_DESIREDDISH) {
			return ORM_desiredDish;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_HUNGRYUSER_USERLOCATION) {
			this.userLocation = (de.hhn.se.pmt.foodmood.model.Location) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=de.hhn.se.pmt.foodmood.model.Location.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="LocationID", referencedColumnName="ID") }, foreignKey=@ForeignKey(name="localizes2"))	
	private de.hhn.se.pmt.foodmood.model.Location userLocation;
	
	@OneToMany(mappedBy="remindableUser", orphanRemoval=true, targetEntity=de.hhn.se.pmt.foodmood.model.Reminder.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.ALL})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_theReminder = new java.util.HashSet();
	
	@OneToMany(mappedBy="theHungryUser", targetEntity=de.hhn.se.pmt.foodmood.model.Dish.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_desiredDish = new java.util.HashSet();
	
	public void setUserLocation(de.hhn.se.pmt.foodmood.model.Location value) {
		if (userLocation != null) {
			userLocation.theHungryUser.remove(this);
		}
		if (value != null) {
			value.theHungryUser.add(this);
		}
	}
	
	public de.hhn.se.pmt.foodmood.model.Location getUserLocation() {
		return userLocation;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_UserLocation(de.hhn.se.pmt.foodmood.model.Location value) {
		this.userLocation = value;
	}
	
	private de.hhn.se.pmt.foodmood.model.Location getORM_UserLocation() {
		return userLocation;
	}
	
	private void setORM_TheReminder(java.util.Set value) {
		this.ORM_theReminder = value;
	}
	
	private java.util.Set getORM_TheReminder() {
		return ORM_theReminder;
	}
	
	@Transient	
	public final de.hhn.se.pmt.foodmood.model.ReminderSetCollection theReminder = new de.hhn.se.pmt.foodmood.model.ReminderSetCollection(this, _ormAdapter, ORMConstants.KEY_HUNGRYUSER_THEREMINDER, ORMConstants.KEY_REMINDER_REMINDABLEUSER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_DesiredDish(java.util.Set value) {
		this.ORM_desiredDish = value;
	}
	
	private java.util.Set getORM_DesiredDish() {
		return ORM_desiredDish;
	}
	
	@Transient	
	public final de.hhn.se.pmt.foodmood.model.DishSetCollection desiredDish = new de.hhn.se.pmt.foodmood.model.DishSetCollection(this, _ormAdapter, ORMConstants.KEY_HUNGRYUSER_DESIREDDISH, ORMConstants.KEY_DISH_THEHUNGRYUSER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}

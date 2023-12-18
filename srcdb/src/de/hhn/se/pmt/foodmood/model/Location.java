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
@Table(name="Location")
public class Location implements Serializable {
	public Location() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_LOCATION_THEFOODBUSINESS) {
			return ORM_theFoodBusiness;
		}
		else if (key == ORMConstants.KEY_LOCATION_THEHUNGRYUSER) {
			return ORM_theHungryUser;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SE_PMT_FOODMOOD_MODEL_LOCATION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SE_PMT_FOODMOOD_MODEL_LOCATION_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Plz", nullable=false, length=10)	
	private int plz;
	
	@Column(name="City", nullable=true, length=255)	
	private String city;
	
	@Column(name="Latitude", nullable=false)	
	private double latitude;
	
	@Column(name="Longtitude", nullable=false)	
	private double longtitude;
	
	@OneToMany(mappedBy="businessLocation", targetEntity=de.hhn.se.pmt.foodmood.model.FoodBusiness.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_theFoodBusiness = new java.util.HashSet();
	
	@OneToMany(mappedBy="userLocation", targetEntity=de.hhn.se.pmt.foodmood.model.HungryUser.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_theHungryUser = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setPlz(int value) {
		this.plz = value;
	}
	
	public int getPlz() {
		return plz;
	}
	
	public void setCity(String value) {
		this.city = value;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setLatitude(double value) {
		this.latitude = value;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLongtitude(double value) {
		this.longtitude = value;
	}
	
	public double getLongtitude() {
		return longtitude;
	}
	
	private void setORM_TheFoodBusiness(java.util.Set value) {
		this.ORM_theFoodBusiness = value;
	}
	
	private java.util.Set getORM_TheFoodBusiness() {
		return ORM_theFoodBusiness;
	}
	
	@Transient	
	public final de.hhn.se.pmt.foodmood.model.FoodBusinessSetCollection theFoodBusiness = new de.hhn.se.pmt.foodmood.model.FoodBusinessSetCollection(this, _ormAdapter, ORMConstants.KEY_LOCATION_THEFOODBUSINESS, ORMConstants.KEY_FOODBUSINESS_BUSINESSLOCATION, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_TheHungryUser(java.util.Set value) {
		this.ORM_theHungryUser = value;
	}
	
	private java.util.Set getORM_TheHungryUser() {
		return ORM_theHungryUser;
	}
	
	@Transient	
	public final de.hhn.se.pmt.foodmood.model.HungryUserSetCollection theHungryUser = new de.hhn.se.pmt.foodmood.model.HungryUserSetCollection(this, _ormAdapter, ORMConstants.KEY_LOCATION_THEHUNGRYUSER, ORMConstants.KEY_HUNGRYUSER_USERLOCATION, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}

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
@DiscriminatorValue("FoodBusinessOwner")
public class FoodBusinessOwner extends de.hhn.se.pmt.foodmood.model.User implements Serializable {
	public FoodBusinessOwner() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_FOODBUSINESSOWNER_NEWDISH) {
			return ORM_newDish;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_FOODBUSINESSOWNER_BUSINESS) {
			this.business = (de.hhn.se.pmt.foodmood.model.FoodBusiness) owner;
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
	
	@OneToOne(targetEntity=de.hhn.se.pmt.foodmood.model.FoodBusiness.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="FoodBusinessID", referencedColumnName="ID") }, foreignKey=@ForeignKey(name="owns"))	
	private de.hhn.se.pmt.foodmood.model.FoodBusiness business;
	
	@Column(name="PhoneNumber", nullable=true, length=255)	
	private String phoneNumber;
	
	@Column(name="Address", nullable=true, length=255)	
	private String address;
	
	@ManyToMany(mappedBy="ORM_chef", targetEntity=de.hhn.se.pmt.foodmood.model.Dish.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_newDish = new java.util.HashSet();
	
	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setBusiness(de.hhn.se.pmt.foodmood.model.FoodBusiness value) {
		if (this.business != value) {
			de.hhn.se.pmt.foodmood.model.FoodBusiness lbusiness = this.business;
			this.business = value;
			if (value != null) {
				business.setOwner(this);
			}
			if (lbusiness != null && lbusiness.getOwner() == this) {
				lbusiness.setOwner(null);
			}
		}
	}
	
	public de.hhn.se.pmt.foodmood.model.FoodBusiness getBusiness() {
		return business;
	}
	
	private void setORM_NewDish(java.util.Set value) {
		this.ORM_newDish = value;
	}
	
	private java.util.Set getORM_NewDish() {
		return ORM_newDish;
	}
	
	@Transient	
	public final de.hhn.se.pmt.foodmood.model.DishSetCollection newDish = new de.hhn.se.pmt.foodmood.model.DishSetCollection(this, _ormAdapter, ORMConstants.KEY_FOODBUSINESSOWNER_NEWDISH, ORMConstants.KEY_DISH_CHEF, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}

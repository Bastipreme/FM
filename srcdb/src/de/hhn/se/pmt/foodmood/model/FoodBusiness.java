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
@Table(name="FoodBusiness")
public class FoodBusiness implements Serializable {
	public FoodBusiness() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_FOODBUSINESS_BUSINESSLOCATION) {
			this.businessLocation = (de.hhn.se.pmt.foodmood.model.Location) owner;
		}
		
		else if (key == ORMConstants.KEY_FOODBUSINESS_OWNER) {
			this.owner = (de.hhn.se.pmt.foodmood.model.FoodBusinessOwner) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SE_PMT_FOODMOOD_MODEL_FOODBUSINESS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SE_PMT_FOODMOOD_MODEL_FOODBUSINESS_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=de.hhn.se.pmt.foodmood.model.Location.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="LocationID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="localizes"))	
	private de.hhn.se.pmt.foodmood.model.Location businessLocation;
	
	@Column(name="BusinessName", nullable=true, length=255)	
	private String businessName;
	
	@OneToOne(mappedBy="business", targetEntity=de.hhn.se.pmt.foodmood.model.FoodBusinessOwner.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private de.hhn.se.pmt.foodmood.model.FoodBusinessOwner owner;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setBusinessName(String value) {
		this.businessName = value;
	}
	
	public String getBusinessName() {
		return businessName;
	}
	
	public void setBusinessLocation(de.hhn.se.pmt.foodmood.model.Location value) {
		if (businessLocation != null) {
			businessLocation.theFoodBusiness.remove(this);
		}
		if (value != null) {
			value.theFoodBusiness.add(this);
		}
	}
	
	public de.hhn.se.pmt.foodmood.model.Location getBusinessLocation() {
		return businessLocation;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_BusinessLocation(de.hhn.se.pmt.foodmood.model.Location value) {
		this.businessLocation = value;
	}
	
	private de.hhn.se.pmt.foodmood.model.Location getORM_BusinessLocation() {
		return businessLocation;
	}
	
	public void setOwner(de.hhn.se.pmt.foodmood.model.FoodBusinessOwner value) {
		if (this.owner != value) {
			de.hhn.se.pmt.foodmood.model.FoodBusinessOwner lowner = this.owner;
			this.owner = value;
			if (value != null) {
				owner.setBusiness(this);
			}
			if (lowner != null && lowner.getBusiness() == this) {
				lowner.setBusiness(null);
			}
		}
	}
	
	public de.hhn.se.pmt.foodmood.model.FoodBusinessOwner getOwner() {
		return owner;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}

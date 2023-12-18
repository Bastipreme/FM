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
@Table(name="Dish")
public class Dish implements Serializable {
	public Dish() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_DISH_CHEF) {
			return ORM_chef;
		}
		else if (key == ORMConstants.KEY_DISH_THEADMIN) {
			return ORM_theAdmin;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_DISH_THEHUNGRYUSER) {
			this.theHungryUser = (de.hhn.se.pmt.foodmood.model.HungryUser) owner;
		}
		
		else if (key == ORMConstants.KEY_DISH_INSTRUCTION) {
			this.instruction = (de.hhn.se.pmt.foodmood.model.Recipe) owner;
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
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SE_PMT_FOODMOOD_MODEL_DISH_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SE_PMT_FOODMOOD_MODEL_DISH_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToMany(targetEntity=de.hhn.se.pmt.foodmood.model.FoodBusinessOwner.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="User_Dish2", joinColumns={ @JoinColumn(name="DishID") }, inverseJoinColumns={ @JoinColumn(name="UserID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_chef = new java.util.HashSet();
	
	@Column(name="Title", nullable=true, length=255)	
	private String title;
	
	@Column(name="Description", nullable=true, length=700)	
	private String description;
	
	@Column(name="Recipe", nullable=true, length=700)	
	private String recipe;
	
	@ManyToOne(targetEntity=de.hhn.se.pmt.foodmood.model.HungryUser.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UserID", referencedColumnName="ID") }, foreignKey=@ForeignKey(name="selects"))	
	private de.hhn.se.pmt.foodmood.model.HungryUser theHungryUser;
	
	@ManyToMany(targetEntity=de.hhn.se.pmt.foodmood.model.Administrator.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="User_Dish3", joinColumns={ @JoinColumn(name="DishID") }, inverseJoinColumns={ @JoinColumn(name="UserID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_theAdmin = new java.util.HashSet();
	
	@OneToOne(mappedBy="preparableDish", targetEntity=de.hhn.se.pmt.foodmood.model.Recipe.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private de.hhn.se.pmt.foodmood.model.Recipe instruction;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setRecipe(String value) {
		this.recipe = value;
	}
	
	public String getRecipe() {
		return recipe;
	}
	
	private void setORM_Chef(java.util.Set value) {
		this.ORM_chef = value;
	}
	
	private java.util.Set getORM_Chef() {
		return ORM_chef;
	}
	
	@Transient	
	public final de.hhn.se.pmt.foodmood.model.FoodBusinessOwnerSetCollection chef = new de.hhn.se.pmt.foodmood.model.FoodBusinessOwnerSetCollection(this, _ormAdapter, ORMConstants.KEY_DISH_CHEF, ORMConstants.KEY_FOODBUSINESSOWNER_NEWDISH, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setTheHungryUser(de.hhn.se.pmt.foodmood.model.HungryUser value) {
		if (theHungryUser != null) {
			theHungryUser.desiredDish.remove(this);
		}
		if (value != null) {
			value.desiredDish.add(this);
		}
	}
	
	public de.hhn.se.pmt.foodmood.model.HungryUser getTheHungryUser() {
		return theHungryUser;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_TheHungryUser(de.hhn.se.pmt.foodmood.model.HungryUser value) {
		this.theHungryUser = value;
	}
	
	private de.hhn.se.pmt.foodmood.model.HungryUser getORM_TheHungryUser() {
		return theHungryUser;
	}
	
	private void setORM_TheAdmin(java.util.Set value) {
		this.ORM_theAdmin = value;
	}
	
	private java.util.Set getORM_TheAdmin() {
		return ORM_theAdmin;
	}
	
	@Transient	
	public final de.hhn.se.pmt.foodmood.model.AdministratorSetCollection theAdmin = new de.hhn.se.pmt.foodmood.model.AdministratorSetCollection(this, _ormAdapter, ORMConstants.KEY_DISH_THEADMIN, ORMConstants.KEY_ADMINISTRATOR_THEDISH, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setInstruction(de.hhn.se.pmt.foodmood.model.Recipe value) {
		if (this.instruction != value) {
			de.hhn.se.pmt.foodmood.model.Recipe linstruction = this.instruction;
			this.instruction = value;
			if (value != null) {
				instruction.setPreparableDish(this);
			}
			if (linstruction != null && linstruction.getPreparableDish() == this) {
				linstruction.setPreparableDish(null);
			}
		}
	}
	
	public de.hhn.se.pmt.foodmood.model.Recipe getInstruction() {
		return instruction;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}

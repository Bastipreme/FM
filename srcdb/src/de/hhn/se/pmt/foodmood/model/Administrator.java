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
@DiscriminatorValue("Administrator")
public class Administrator extends de.hhn.se.pmt.foodmood.model.User implements Serializable {
	public Administrator() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ADMINISTRATOR_THEDISH) {
			return ORM_theDish;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@ManyToMany(mappedBy="ORM_theAdmin", targetEntity=de.hhn.se.pmt.foodmood.model.Dish.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_theDish = new java.util.HashSet();
	
	private void setORM_TheDish(java.util.Set value) {
		this.ORM_theDish = value;
	}
	
	private java.util.Set getORM_TheDish() {
		return ORM_theDish;
	}
	
	@Transient	
	public final de.hhn.se.pmt.foodmood.model.DishSetCollection theDish = new de.hhn.se.pmt.foodmood.model.DishSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRATOR_THEDISH, ORMConstants.KEY_DISH_THEADMIN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}

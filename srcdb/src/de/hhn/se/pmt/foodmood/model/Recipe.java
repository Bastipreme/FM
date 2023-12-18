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
@Table(name="Recipe")
public class Recipe implements Serializable {
	public Recipe() {
	}
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SE_PMT_FOODMOOD_MODEL_RECIPE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SE_PMT_FOODMOOD_MODEL_RECIPE_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@OneToOne(targetEntity=de.hhn.se.pmt.foodmood.model.Dish.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="DishID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="describes"))	
	private de.hhn.se.pmt.foodmood.model.Dish preparableDish;
	
	@Column(name="Content", nullable=true, length=700)	
	private String content;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setPreparableDish(de.hhn.se.pmt.foodmood.model.Dish value) {
		if (this.preparableDish != value) {
			de.hhn.se.pmt.foodmood.model.Dish lpreparableDish = this.preparableDish;
			this.preparableDish = value;
			if (value != null) {
				preparableDish.setInstruction(this);
			}
			if (lpreparableDish != null && lpreparableDish.getInstruction() == this) {
				lpreparableDish.setInstruction(null);
			}
		}
	}
	
	public de.hhn.se.pmt.foodmood.model.Dish getPreparableDish() {
		return preparableDish;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}

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
@Table(name="Reminder")
public class Reminder implements Serializable {
	public Reminder() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_REMINDER_REMINDABLEUSER) {
			this.remindableUser = (de.hhn.se.pmt.foodmood.model.HungryUser) owner;
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
	@GeneratedValue(generator="DE_HHN_SE_PMT_FOODMOOD_MODEL_REMINDER_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SE_PMT_FOODMOOD_MODEL_REMINDER_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=de.hhn.se.pmt.foodmood.model.HungryUser.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UserID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="sets"))	
	private de.hhn.se.pmt.foodmood.model.HungryUser remindableUser;
	
	@Column(name="HourOfReminder", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date hourOfReminder;
	
	@Column(name="Validated", nullable=false, length=1)	
	private boolean validated;
	
	@Column(name="Occurrence", nullable=true, length=255)	
	private String occurrence;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setHourOfReminder(java.util.Date value) {
		this.hourOfReminder = value;
	}
	
	public java.util.Date getHourOfReminder() {
		return hourOfReminder;
	}
	
	public void setValidated(boolean value) {
		this.validated = value;
	}
	
	public boolean getValidated() {
		return validated;
	}
	
	public void setOccurrence(String value) {
		this.occurrence = value;
	}
	
	public String getOccurrence() {
		return occurrence;
	}
	
	public void setRemindableUser(de.hhn.se.pmt.foodmood.model.HungryUser value) {
		if (remindableUser != null) {
			remindableUser.theReminder.remove(this);
		}
		if (value != null) {
			value.theReminder.add(this);
		}
	}
	
	public de.hhn.se.pmt.foodmood.model.HungryUser getRemindableUser() {
		return remindableUser;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_RemindableUser(de.hhn.se.pmt.foodmood.model.HungryUser value) {
		this.remindableUser = value;
	}
	
	private de.hhn.se.pmt.foodmood.model.HungryUser getORM_RemindableUser() {
		return remindableUser;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}

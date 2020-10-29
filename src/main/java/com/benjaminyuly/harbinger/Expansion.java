package com.benjaminyuly.harbinger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Expansion {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	
	private String name;
	
	@Column(length=2000)
	private String flavor;
	
	@Column(length=2000)
	private String mechanics;
	
	public Expansion() {
		
	}
	
	public Expansion(String name, String flavor, String mechanics) {
		this.setName(name);
		this.setFlavor(flavor);
		this.setMechanics(mechanics);
	}
	
	@Override
	public String toString() {
		return String.format("id=%d,\nname=%d,\nflavor=%d,\nmechanics=%d", id, name, flavor, mechanics);
	}

	/**
	 * @return the mechanics text
	 */
	public String getMechanics() {
		return mechanics;
	}

	/**
	 * @param mechanics the mechanics text to set
	 */
	public void setMechanics(String mechanics) {
		this.mechanics = mechanics;
	}

	/**
	 * @return the flavor text
	 */
	public String getFlavor() {
		return flavor;
	}

	/**
	 * @param flavor the flavor text to set
	 */
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

}

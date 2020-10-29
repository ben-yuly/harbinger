package com.benjaminyuly.harbinger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Card {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	
	private String name;
	
	private String cost;
	
	private Boolean kingdom;
	
	@Column(length=2000)
	private String text;
	
	public Card() {
		
	}
	
	public Card(String name, String cost, Boolean kingdom, String text) {
		this.setName(name);
		this.setCost(cost);
		this.setKingdom(kingdom);
		this.setText(text);
	}
	
	@Override
	public String toString() {
		return String.format("id=%d\nname=%d\ncost=%d\nkingdom=%d\ntext=%d", id, name, cost, kingdom, text);
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
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
	 * @return the cost
	 */
	public String getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(String cost) {
		this.cost = cost;
	}

	/**
	 * @return the kingdom
	 */
	public Boolean getKingdom() {
		return kingdom;
	}

	/**
	 * @param kingdom the kingdom to set
	 */
	public void setKingdom(Boolean kingdom) {
		this.kingdom = kingdom;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
}
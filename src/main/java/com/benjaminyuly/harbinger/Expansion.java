package com.benjaminyuly.harbinger;

public class Expansion {
	
	private final long id;
	private String name;
	private String flavor;
	private String mechanics;
	
	public Expansion(long id, String name, String flavor, String mechanics) {
		this.id = id;
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
	public long getId() {
		return id;
	}

}

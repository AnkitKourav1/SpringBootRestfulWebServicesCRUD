package com.data.bean;

public class Overseas {

	int id;
	String overseasName;
	long population;

	public Overseas() {
		super();
	}

	public Overseas(int i, String overseasName, long population) {
		super();
		this.id = i;
		this.overseasName = overseasName;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOverseasName() {
		return overseasName;
	}

	public void setOverseasName(String overseasName) {
		this.overseasName = overseasName;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

}
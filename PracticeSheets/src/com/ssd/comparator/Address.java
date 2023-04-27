package com.ssd.comparator;

public class Address  {
	private int dno;
	private String city;
	private String state;
	
	public Address() {
		
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(int dno, String city, String state) {
		super();
		this.dno = dno;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", city=" + city + ", state=" + state + "]";
	}
	
			
		
		
	}
	


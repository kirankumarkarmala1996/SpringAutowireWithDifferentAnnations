package com.AutowireAnnatation;

public class Heart {
	
	private String humanName;
	private int number;


	public String getHumanName() {
		return humanName;
	}


	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public void HeartBeating() {
		System.out.println("heart is pumping  ");
		System.out.println(" then your heart is alive ");
	}

}

package com.mondee;

public class Travel implements Journey{
	
	Vehicle v;
	
	public void setV(Vehicle v) {
		this.v = v;
	}



	public void startJourny() {
		
		System.out.println("Starting Journey!!!");
		v.move();
		
	}

}

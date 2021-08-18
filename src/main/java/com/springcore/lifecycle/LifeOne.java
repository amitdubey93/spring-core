package com.springcore.lifecycle;

public class LifeOne {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
		System.out.println("Setting Value: "+value);
	}

	@Override
	public String toString() {
		return "LifeOne [value=" + value + "]";
	}
	
	public void suru(){
		System.out.println("suru ho gaya");
	}
	
	public void khatam(){
		System.out.println("khatam v ho gaya");
	}
}

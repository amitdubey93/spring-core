package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeThree {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@PostConstruct
	public void suru(){
		System.out.println("suru ho gaya");
	}
	@PreDestroy
	public void khatam(){
		System.out.println("khatam v ho gaya");
	}
	
	@Override
	public String toString() {
		return "LifeThree [value=" + value + "]";
	}
	
}

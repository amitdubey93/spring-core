package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeTwo implements InitializingBean,DisposableBean{
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "LifeTwo [value=" + value + "]";
	}

	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("suru ho gaya");
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("khatam v ho gaya");
	}

	
}

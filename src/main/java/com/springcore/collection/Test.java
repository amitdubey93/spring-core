package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/config.xml");
		Employee emp = context.getBean("emp",Employee.class);
		
		System.out.println(emp);
	}

}

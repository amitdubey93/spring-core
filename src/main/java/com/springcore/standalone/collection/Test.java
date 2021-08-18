package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/config.xml");
		Employee emp = context.getBean("emp",Employee.class);
		
		
		System.out.println(emp);
		System.out.println(emp.getPhones().getClass());
		System.out.println(emp.getAddresses().getClass().getName());
		System.out.println(emp.getCourses().getClass());
		System.out.println(emp.getPros().getClass());
	}

}

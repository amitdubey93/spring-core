package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/config.xml");
		Student stu = context.getBean("student",Student.class);
		
		System.out.println(stu);
	}
}

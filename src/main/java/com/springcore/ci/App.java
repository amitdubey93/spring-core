package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/config.xml");
		Student stu = context.getBean("student",Student.class);
		Student stu2 = context.getBean("student2",Student.class);
		
		System.out.println(stu);
		System.out.println(stu2);
	}
}

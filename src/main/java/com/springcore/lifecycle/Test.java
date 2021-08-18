package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		LifeOne lifeone = context.getBean("lifeone",LifeOne.class);
		System.out.println(lifeone);
		
		
		LifeTwo lifetwo = context.getBean("lifetwo",LifeTwo.class);
		System.out.println(lifetwo);
		
		LifeThree lifethree = context.getBean("lifethree",LifeThree.class);
		System.out.println(lifethree);
		
		context.registerShutdownHook();
		
	}

}

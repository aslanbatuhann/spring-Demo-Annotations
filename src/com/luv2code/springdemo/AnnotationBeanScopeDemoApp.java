package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring config
		Coach theCoach = context.getBean("tennisCoach" , Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach" , Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print out the results
		System.out.println("\n Pointing to the same object: " + result);
		
		System.out.println("\n Memory loacation for theCoach: " + theCoach);
		
		System.out.println("\n Memory loacation for alphaCoach: " + alphaCoach + "\n");
		
		
		context.close();
	}

}

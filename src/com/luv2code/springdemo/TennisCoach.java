package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach : inside default constructor");
	}
	/*
	// define a setter method
	@Autowired
	public void setFortuneService (FortuneService theFortuneService) {
		System.out.println(">> TennisCoach : inside  setFortuneService");
		fortuneService = theFortuneService;
	}*/
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

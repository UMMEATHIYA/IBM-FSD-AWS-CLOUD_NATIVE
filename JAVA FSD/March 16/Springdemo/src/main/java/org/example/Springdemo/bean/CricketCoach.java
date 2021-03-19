package org.example.Springdemo.bean;

public class CricketCoach implements Coach{

private FortuneService fortuneService;

	
	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice spin bowling today.";
	}
	
	public String getDailyFortune()
	{
		return fortuneService.getDailyFortune();
	}
}

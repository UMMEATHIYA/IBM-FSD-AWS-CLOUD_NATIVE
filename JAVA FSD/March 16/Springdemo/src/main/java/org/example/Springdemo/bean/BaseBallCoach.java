package org.example.Springdemo.bean;

public class BaseBallCoach implements Coach{
	FortuneService fortuneService;
	public BaseBallCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

		@Override
		public String getDailyWorkout() {
			// TODO Auto-generated method stub
			return "practice back volley today.";
		}

		@Override
		public String getDailyFortune() {
			// TODO Auto-generated method stub
			return null;
		}

}

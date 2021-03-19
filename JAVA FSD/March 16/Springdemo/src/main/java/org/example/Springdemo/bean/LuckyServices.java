package org.example.Springdemo.bean;

public class LuckyServices implements FortuneService {
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "today is your lucky day.";
	}
}

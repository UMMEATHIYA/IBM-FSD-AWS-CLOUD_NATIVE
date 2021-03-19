package org.example.Setter_Injection.demo;

import org.example.Setter_Injection.demo.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=
        		new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		 * Coach myCoach=context.getBean("theCoach",CricketCoach.class);
		 * System.out.println(myCoach.getDailyWorkout());
		 * System.out.println(myCoach.getDailyFortune());
		 */
        
        Person person=context.getBean("person",Person.class);
        System.out.println(person.getAddress());
        
    }
}

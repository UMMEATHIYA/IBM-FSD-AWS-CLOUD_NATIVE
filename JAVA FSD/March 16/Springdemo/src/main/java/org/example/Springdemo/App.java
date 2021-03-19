package org.example.Springdemo;

/**
 * Hello world!
 *
 */
import org.example.Springdemo.bean.BaseBallCoach;
import org.example.Springdemo.bean.Coach;
import org.example.Springdemo.bean.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach myCoach=context.getBean("theCoach",CricketCoach.class);
        System.out.println(myCoach.getDailyWorkout());
       System.out.println(myCoach.getDailyFortune());
    }
}
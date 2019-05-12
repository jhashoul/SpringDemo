package app;

import app.coaches.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApp {

	public static void main(String[] args) {
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		//Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		System.out.println(theCoach.me());
		// close the context
		context.close();	
	}

}



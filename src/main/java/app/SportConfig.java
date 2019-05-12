package app;

import app.coaches.Coach;
import app.coaches.SwimCoach;
import app.services.FortuneService;
import app.services.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("app")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// Define bean for the fortune service
	@Bean
	public FortuneService fortuneService() {
		return new SadFortuneService();
	}

	// Define bean for the coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(fortuneService());
	}
}

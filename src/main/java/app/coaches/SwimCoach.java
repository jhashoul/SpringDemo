package app.coaches;

import app.services.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	@Value("${prop.email}")
	private String mail;

	@Value("${prop.team}")
	private String team;

	private FortuneService fs;

	public SwimCoach(FortuneService fs) {
		this.fs = fs;
	}

	public String getDailyWorkout() {
		return "Swim 1KM for warm up.";
	}

	public String getDailyFortune() {
		return fs.getFortune();
	}

	@Override
	public String me() {
		return String.format("Team: %s, Email: %s", team, mail);
	}
}

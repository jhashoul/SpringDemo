package app.coaches;

public interface Coach {

	String getDailyWorkout();

	String getDailyFortune();

	default String me() {
		return "";
	}
}

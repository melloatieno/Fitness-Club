package fitness;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
	private static final int LESSON_CAPACITY = 5;
	String lessonCode;
	String time;
	String weekendDay;
	Fitness_Type fitness_Type;
	List<Customer> customerList = new ArrayList<>();
	boolean isAttend;

	  double cost;

	  public Lesson(String lessonCode, String time, String weekendDay,
	      Fitness_Type fitnessType) {
	    this.lessonCode = lessonCode;
	    this.time = time;
	    this.weekendDay = weekendDay;
	    this.fitness_Type = fitnessType;
	    this.cost = fitnessType.getCost();
	  }

	public String getLessonCode() {
		return lessonCode;
	}

	public String getTime() {
		return time;
	}

	public String getWeekendDay() {
		return weekendDay;
	}


	public Fitness_Type getFitness_Type() {
		return fitness_Type;
	}

	public void setFitness_Type(Fitness_Type fitness_Type) {
		this.fitness_Type = fitness_Type;
	}

}

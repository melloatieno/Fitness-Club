package fitness;

import java.util.ArrayList;
import java.util.List;


public class Records {
	public static final String EIGHT_AM = "8.00 am";
	public static final String FIVE_PM = "5.00 pm";

	public static final String SATURDAY = "Saturday";

	public static final String SUNDAY = "Sunday";
	List<Lesson> lesson = new ArrayList<>();
	
	public List<Lesson> displayTimeTable() {
	    addLesson(new Lesson("A001",  EIGHT_AM, SATURDAY, Fitness_Type.Aquacise));
	    addLesson(new Lesson("S001",  EIGHT_AM, SATURDAY, Fitness_Type.Spin));
	    addLesson(new Lesson("Y001", EIGHT_AM, SATURDAY, Fitness_Type.Yoga));
	    addLesson(new Lesson("Z001", EIGHT_AM, SATURDAY, Fitness_Type.Zumba));

	    addLesson(new Lesson("A002", FIVE_PM, SATURDAY, Fitness_Type.Aquacise));
	    addLesson(new Lesson("S002", FIVE_PM, SATURDAY, Fitness_Type.Spin));
	    addLesson(new Lesson("Y002", FIVE_PM, SATURDAY, Fitness_Type.Yoga));
	    addLesson(new Lesson("Z002", FIVE_PM, SATURDAY, Fitness_Type.Zumba));

	    addLesson(new Lesson("A003", EIGHT_AM, SUNDAY, Fitness_Type.Aquacise));
	    addLesson(new Lesson("S003", EIGHT_AM, SUNDAY, Fitness_Type.Spin));
	    addLesson(new Lesson("Y003", EIGHT_AM, SUNDAY, Fitness_Type.Yoga));
	    addLesson(new Lesson("Z002", EIGHT_AM, SUNDAY, Fitness_Type.Zumba));

	    addLesson(new Lesson("A004", FIVE_PM, SUNDAY, Fitness_Type.Aquacise));
	    addLesson(new Lesson("S004", FIVE_PM, SUNDAY, Fitness_Type.Spin));
	    addLesson(new Lesson("Y004", FIVE_PM, SUNDAY, Fitness_Type.Yoga));
	    addLesson(new Lesson("Z004", FIVE_PM, SUNDAY, Fitness_Type.Zumba));

	    addLesson(new Lesson("A005", EIGHT_AM, SATURDAY, Fitness_Type.Aquacise));
	    addLesson(new Lesson("S005", EIGHT_AM, SATURDAY, Fitness_Type.Spin));
	    addLesson(new Lesson("Y005", EIGHT_AM, SATURDAY, Fitness_Type.Yoga));
	    addLesson(new Lesson("Z005", EIGHT_AM, SATURDAY, Fitness_Type.Zumba));

	    addLesson(new Lesson("A006", FIVE_PM, SATURDAY, Fitness_Type.Aquacise));
	    addLesson(new Lesson("S006", FIVE_PM, SATURDAY, Fitness_Type.Spin));
	    addLesson(new Lesson("Y006", FIVE_PM, SATURDAY, Fitness_Type.Yoga));
	    addLesson(new Lesson("Z006", FIVE_PM, SATURDAY, Fitness_Type.Zumba));

	    addLesson(new Lesson("A007", EIGHT_AM, SUNDAY, Fitness_Type.Aquacise));
	    addLesson(new Lesson("S007", EIGHT_AM, SUNDAY, Fitness_Type.Spin));
	    addLesson(new Lesson("Y007", EIGHT_AM, SUNDAY, Fitness_Type.Yoga));
	    addLesson(new Lesson("Z007", EIGHT_AM, SUNDAY, Fitness_Type.Zumba));

	    addLesson(new Lesson("A008", FIVE_PM, SUNDAY, Fitness_Type.Aquacise));
	    addLesson(new Lesson("S008", FIVE_PM, SUNDAY, Fitness_Type.Spin));
	    addLesson(new Lesson("Y008", FIVE_PM, SUNDAY, Fitness_Type.Yoga));
	    addLesson(new Lesson("Z008", FIVE_PM, SUNDAY, Fitness_Type.Zumba));
	    return this.lesson;
	  }

	private void addLesson(Lesson lesson2) {
		// TODO Auto-generated method stub
		
	}

	
}

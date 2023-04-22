package fitness;

import java.util.*;


public class FitnessClub {
	private String type;
	private int price;
	private int maxCapacity;
	private int availableSpots;
	private List<Customer> customers;
	private List<Review> reviews;
	
	public static final String EIGHT_AM = "8.00 am";
	public static final String FIVE_PM = "5.00 pm";

	public static final String SATURDAY = "Saturday";

	public static final String SUNDAY = "Sunday";
	List<Lesson> lesson = new ArrayList<>();


	public FitnessClub(String type, int price, int maxCapacity) {
		super();
		this.type = type;
		this.price = price;
		this.maxCapacity = maxCapacity;
		this.availableSpots = maxCapacity;
		this.customers = new ArrayList<>();
		this.reviews = new ArrayList<>();
	}

	public FitnessClub() {
		// TODO Auto-generated constructor stub
	}

	public String getType() {
	return type;
	}

	public int getPrice() {
	return price;
	}

	public int getMaxCapacity() {
	return maxCapacity;
	}

	public int getAvailableSpots() {
	return availableSpots;
	}

	public List<Customer> getCustomers() {
	return customers;
	}

	public List<Review> getReviews() {
	return reviews;
	}

	public boolean book(Customer customer) {
	if (availableSpots == 0) {
	return false;
	}
	
	customers.add(customer);
	availableSpots--;

	return true;
	}

	public boolean cancel(Customer customer) {
	if (!customers.contains(customer)) {
	return false;
	}

	customers.remove(customer);
	availableSpots++;

	return true;
	}

	public double getAverageRating() {
	if (reviews.size() == 0) {
	return 0;
	}

	double sum = 0;

	for (Review review : reviews) {
	sum += review.getReview();
	}

	return sum / reviews.size();
	}

	public void addReview(Review review) {
	reviews.add(review);
	}

	public void addCustomer(Customer customer) {
	}
	
	public void removeCustomer(Customer customer) {
	    this.customers.remove(customer);
	  }

	public void bookLesson(String customerName, String customerEmail, String day, String time, String fitnessType) {
		// TODO Auto-generated method stub
		
	}

	public void cancelBooking(String customerEmail, String day, String time, String fitnessType) {
		
		
	}

	public void writeReview(String customerEmail, String day, String time, String fitnessType, int rating) {
		// TODO Auto-generated method stub
		
	}

	public void generateReports() {
		// TODO Auto-generated method stub
		
	}

	public List<Lesson> getLesson() {
		return lesson;
	}

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

	public List<Lesson> displayTimetable(String day) {
		return this.lesson;
	}
	
}

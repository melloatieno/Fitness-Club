package fitness;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		FitnessClub fitnessClub = new FitnessClub();
		Scanner scanner = new Scanner(System.in);
		
		
		fitnessClub.addCustomer(new Customer("234", "Melvine Anne", "05751823", "276"));
		fitnessClub.addCustomer(new Customer("235","John Marvin", "45037628", "Lari Street"));

		// Print the available options
		System.out.println("Welcome to the Weekend Fitness Club booking system!");
		System.out.println("Please choose an option:");
		System.out.println("1. View timetable by day");
		System.out.println("2. View timetable by fitness type");
		System.out.println("3. Book a lesson");
		System.out.println("4. Cancel a booking");
		System.out.println("5. Write a review");
		System.out.println("6. Generate reports");
		System.out.println("0. Exit");

		// Process the user's choice
		int choice;
		do {
		System.out.print("Enter your choice: ");
		choice = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		switch (choice) {
		case 1:
		System.out.print("Enter day (Saturday or Sunday): ");
		String day = scanner.nextLine();
		fitnessClub.displayTimetable(day);
		break;
		case 2:
		System.out.print("Enter fitness type: ");
		String fitnessType = scanner.nextLine();
		fitnessClub.displayTimetable(fitnessType);
		break;
		case 3:
		System.out.print("Enter customer name: ");
		String customerName = scanner.nextLine();
		System.out.print("Enter customer email: ");
		String customerEmail = scanner.nextLine();
		System.out.print("Enter day (Saturday or Sunday): ");
		day = scanner.nextLine();
		System.out.print("Enter time (morning or afternoon): ");
		String time = scanner.nextLine();
		System.out.print("Enter fitness type: ");
		fitnessType = scanner.nextLine();
		fitnessClub.bookLesson(customerName, customerEmail, day, time, fitnessType);
		break;
		case 4:
		System.out.print("Enter customer email: ");
		customerEmail = scanner.nextLine();
		System.out.print("Enter day (Saturday or Sunday): ");
		day = scanner.nextLine();
		System.out.print("Enter time (morning or afternoon): ");
		time = scanner.nextLine();
		System.out.print("Enter fitness type: ");
		fitnessType = scanner.nextLine();
		fitnessClub.cancelBooking(customerEmail, day, time, fitnessType);
		break;
		case 5:
		System.out.print("Enter customer email: ");
		customerEmail = scanner.nextLine();
		System.out.print("Enter day (Saturday or Sunday): ");
		day = scanner.nextLine();
		System.out.print("Enter time (morning or afternoon): ");
		time = scanner.nextLine();
		System.out.print("Enter fitness type: ");
		fitnessType = scanner.nextLine();
		System.out.print("Enter rating (1-5): ");
		int rating = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character
		fitnessClub.writeReview(customerEmail, day, time, fitnessType, rating);
		break;
		case 6:
		fitnessClub.generateReports();
		break;
		case 0:
		System.out.println("Thank you for using the Weekend Fitness Club booking system!");
		break;
		default:
		System.out.println("Invalid choice. Please try again.");
		}
		} while (choice != 0);

		scanner.close();
		}

}

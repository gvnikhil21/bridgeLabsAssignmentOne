package employee;

public class Employee {
	// Constants
	public static final int IS_PRESENT = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;
	public static final int FULL_DAY_HOUR = 8;
	public static final int PART_TIME_HOUR = 4;
	public static final int WORKING_DAYS_PER_MONTH = 20;
	public static final int TOTAL_WORKING_HOURS = 100;

	// Variables
	private int totalWage = 0;
	private int noOfHours = 0;
	private int noOfDays = 0;
	private int empHour = 0;
	private String empType = "";

	// calculates employee hours till 100Hours/20Days whichever earlier is reached
	public int calculateEmpHours() {
		while (noOfHours < TOTAL_WORKING_HOURS && noOfDays < WORKING_DAYS_PER_MONTH) {
			double empCheck = Math.floor(Math.random() * 10) % 3;
			noOfDays++;
			switch ((int) empCheck) {
			case IS_PRESENT:
				empType = "Full-Time";
				empHour = FULL_DAY_HOUR;
				break;
			case IS_PART_TIME:
				empType = "Part-Time";
				empHour = PART_TIME_HOUR;
				break;
			default:
				empType = "Absent\t";
				empHour = 0;
				break;
			}
			noOfHours += empHour;
			if (noOfHours > TOTAL_WORKING_HOURS)
				noOfHours = TOTAL_WORKING_HOURS;
			System.out.println(empType + "\t" + noOfHours + "\t" + noOfDays);
		}
		return noOfHours;
	}

	// calculates total wage of employee
	public void calculateEmpWage(int totalHour) {
		totalWage = totalHour * WAGE_PER_HOUR;
		System.out.println("-----------------------------");
		System.out.println("Total Employee Wage is : " + totalWage);
	}

	// main method
	public static void main(String[] args) {
		// Welcome statement
		System.out.println("Welcome to Employee Wage Computation Program!");
		System.out.println("-----------------------------");
		System.out.println("EmpType\t\tHours\tDays");
		System.out.println("-----------------------------");

		// creating object employee of Employee class
		Employee employee = new Employee();
		int totalHour = employee.calculateEmpHours();
		employee.calculateEmpWage(totalHour);
	}
}
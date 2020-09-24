package employee;

public class Employee {
	//Constants
	public static final int IS_PRESENT=1;
	public static final int IS_PART_TIME=2;
	public static final int WAGE_PER_HOUR=20;
	public static final int FULL_DAY_HOUR=8;
	public static final int PART_TIME_HOUR=4;

	public static void main(String[] args) {
		//Variables
		int noOfHour=0;
		int dailyWage=0;		
		
		//Welcome statement
		System.out.println("Welcome to Employee Wage Computation Program!");

		//Modifying if-else to Switch-Case
		double empCheck = Math.floor(Math.random() * 10) % 3;
		switch((int)empCheck) {
			case IS_PRESENT:
				System.out.println("Employee is Full-Time and Present!");
				noOfHour = FULL_DAY_HOUR;
				break;
			case IS_PART_TIME:
				System.out.println("Employee is Part-Time and Present!");
				noOfHour = PART_TIME_HOUR;
				break;
			default:
				System.out.println("Employee is Absent!");
				break;
		}

		//Calculate Daily Employee Wage
		dailyWage = noOfHour * WAGE_PER_HOUR;
		System.out.println("Daily Employee Wage is : "+ dailyWage);
	}
}


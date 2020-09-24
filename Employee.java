package employee;

public class Employee {
	//Constants
	public static final int IS_PRESENT=1;
	public static final int IS_PART_TIME=2;
	public static final int WAGE_PER_HOUR=20;
	public static final int FULL_DAY_HOUR=8;
	public static final int PART_TIME_HOUR=4;
	public static final int WORKING_DAYS_PER_MONTH=20;
	public static final int TOTAL_WORKING_HOURS=100;

	public static void main(String[] args) {
		//Variables
		int noOfHour=0;
		int totalWage=0;
		int noOfDays=1;
		//Welcome statement
		System.out.println("Welcome to Employee Wage Computation Program!");

		//Applying condition for calculating wage of employee till 100Hours/20Days 
		double empCheck = Math.floor(Math.random() * 10) % 3;
		switch((int)empCheck) {
			case IS_PRESENT:
				System.out.println("Employee is Full-Time and Present!");
				while(noOfHour <= TOTAL_WORKING_HOURS && noOfDays<=WORKING_DAYS_PER_MONTH){
				noOfHour += FULL_DAY_HOUR;
				noOfDays++;
			}
				if(noOfHour > TOTAL_WORKING_HOURS)
				noOfHour=TOTAL_WORKING_HOURs;
				break;
			case IS_PART_TIME:
				System.out.println("Employee is Part-Time and Present!");
				while(noOfHour <= TOTAL_WORKING_HOURS && noOfDays<=WORKING_DAYS_PER_MONTH){
				noOfHour += PART_TIME_HOUR;
				noOfDays++;
			}
				if(noOfHour > TOTAL_WORKING_HOURS)
				noOfHour=TOTAL_WORKING_HOURS;
				break;
			default:
				System.out.println("Employee is Absent!");
				break;
		}

		//Calculate Total Employee Wage
		totalWage = noOfHour * WAGE_PER_HOUR;
		System.out.println("Total Employee Wage is : "+ totalWage);
	}
}


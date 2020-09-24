package employee;

public class Employee {
	//Constants
	public static final int IS_PRESENT=1;
	public static final int WAGE_PER_HOUR=20;
	public static final int FULL_DAY_HOUR=8;

	public static void main(String[] args) {
		//Variables
		int noOfHour=0;
		int dailyWage=0;		
		
		//Welcome statement
		System.out.println("Welcome to Employee Wage Computation Program!");

		//Check Employee Present or Absent
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==IS_PRESENT) 
			System.out.println("Employee is Present!");
		else 
			System.out.println("Employee is Absent!");
		
		//Calculate Daily Employee Wage
		dailyWage = noOfHour * WAGE_PER_HOUR;
		System.out.println("Daily Employee Wage is : "+ dailyWage);
	}
}


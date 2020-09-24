package employee;

public class Employee {
	public static void main(String[] args) {
		
		//Welcome statement
		System.out.println("Welcome to Employee Wage Computation Program!");

		//Check Employee Present or Absent
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==IS_PRESENT) 
			System.out.println("Employee is Present!");
		else 
			System.out.println("Employee is Absent!");
	}
}


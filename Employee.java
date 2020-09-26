package employee;

public class Employee {

	public static void main(String[] args) {
		// Welcome statement
		System.out.println("Welcome to Employee Wage Computation Program!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("companyName\twagePerHour\ttotalDays\ttotalHours\tempHours\tempDays\t\tempWage");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");

		// creating object of Company class
		// companyOne
		Company companyOne = new Company("companyOne", 20, 20, 100);
		companyOne.calculateEmpWage();
		printDetails(companyOne);
		// companyTwo
		Company companyTwo = new Company("companyTwo", 40, 25, 120);
		companyTwo.calculateEmpWage();
		printDetails(companyTwo);

		// companyThree
		Company companyThree = new Company("companyThree", 50, 30, 140);
		companyThree.calculateEmpWage();
		printDetails(companyThree);

	}

	public static void printDetails(Company company) {
		System.out.println(company.getCompanyName() + "\t" + company.getWagePerHour() + "\t\t"
				+ company.getWorkingDaysPerMonth() + "\t\t" + company.getWorkingHoursPerMonth() + "\t\t"
				+ company.getNoOfHours() + "\t\t" + company.getNoOfDays() + "\t\t" + company.getTotalWage());
	}
}

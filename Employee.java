package com.bridgeLabs.employeeWageProblem;

public class Employee {

	public static void main(String[] args) {
		// Welcome statement
		System.out.println("Welcome to Employee Wage Computation Program!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("companyName\twagePerHour\ttotalDays\ttotalHours\tempHours\tempDays\t\tempWage");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");

		// creating object of EmpWageBuilder class
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();

		// adding companies
		empWageBuilder.addCompany("companyOne", 20, 20, 100);
		empWageBuilder.addCompany("companyTwo", 40, 25, 120);
		empWageBuilder.addCompany("companyThree", 50, 30, 140);

		// calculating empWage for multiple companies
		Company companyArray[] = empWageBuilder.getCompanyArray();
		for (Company company : companyArray) {
			empWageBuilder.calculateEmpWage(company);
			System.out.print(company);
			System.out.println(empWageBuilder);
		}
	}
}

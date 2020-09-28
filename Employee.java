package com.bridgeLabs.employeeWageProblem;

import java.util.*;

public class Employee {

	public static void main(String[] args) {
		// Welcome statement
		System.out.println("Welcome to Employee Wage Computation Program!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("companyName\twagePerHour\ttotalDays\ttotalHours\tempHours\tempDays\t\tempWage");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");

		// creating Employee object
		Employee employee = new Employee();
		// creating EmpWageBuilder object with reference to IEmpWageBuilder interface
		IEmpWageBuilder empWageBuilder = new EmpWageBuilder();

		// adding companies
		empWageBuilder.addCompany("companyOne", 20, 20, 100);
		empWageBuilder.addCompany("companyTwo", 40, 25, 120);
		empWageBuilder.addCompany("companyThree", 50, 30, 140);

		// calculating empWage for multiple companies
		employee.calculateAndPrintEmpWage(empWageBuilder);
	}

	public void calculateAndPrintEmpWage(IEmpWageBuilder empWageBuilder) {
		ArrayList<Company> companyList = empWageBuilder.getCompanyList();
		for (Company company : companyList) {
			empWageBuilder.calculateEmpWage(company);
			System.out.print(company);
			System.out.println(empWageBuilder);
		}
	}
}

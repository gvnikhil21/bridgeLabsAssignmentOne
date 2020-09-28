package com.bridgeLabs.employeeWageProblem;

public class EmpWageBuilder {
	// Constants
	private static final int IS_PRESENT = 1;
	private static final int IS_PART_TIME = 2;
	private static final int FULL_TIME_HOUR = 8;
	private static final int PART_TIME_HOUR = 4;

	// variables
	private int totalWage = 0;
	private int noOfHours = 0;
	private int noOfDays = 0;
	private int empHour = 0;
	private int countOfCompany = 0;
	Company companyArray[] = new Company[3];

	public Company[] getCompanyArray() {
		return companyArray;
	}

	// add company to companyList
	public void addCompany(String companyName, int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth) {
		companyArray[countOfCompany] = new Company(companyName, wagePerHour, workingDaysPerMonth, workingHoursPerMonth);
		countOfCompany++;
	}

	// calculates employee wage till 100Hours/20Days whichever earlier is reached
	public int calculateEmpWage(Company company) {
		while (noOfHours < company.getWorkingHoursPerMonth() && noOfDays < company.getWorkingDaysPerMonth()) {
			double empCheck = Math.floor(Math.random() * 10) % 3;
			noOfDays++;
			switch ((int) empCheck) {
			case IS_PRESENT:
				empHour = FULL_TIME_HOUR;
				break;
			case IS_PART_TIME:
				empHour = PART_TIME_HOUR;
				break;
			default:
				empHour = 0;
				break;
			}
			noOfHours += empHour;
			if (noOfHours > company.getWorkingHoursPerMonth())
				noOfHours = company.getWorkingHoursPerMonth();
		}
		totalWage = noOfHours * company.getWagePerHour();
		return totalWage;
	}

	@Override
	public String toString() {
		return noOfHours + "\t\t" + noOfDays + "\t\t" + totalWage;
	}
}

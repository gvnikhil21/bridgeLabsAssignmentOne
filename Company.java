package com.bridgeLabs.employeeWageProblem;

public class Company {

	// variables
	private String companyName;
	private int wagePerHour;
	private int workingDaysPerMonth;
	private int workingHoursPerMonth;

	// constructor
	public Company(String companyName, int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.workingDaysPerMonth = workingDaysPerMonth;
		this.workingHoursPerMonth = workingHoursPerMonth;
	}

	// getters and setters
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getWagePerHour() {
		return wagePerHour;
	}

	public void setWagePerHour(int wagePerHour) {
		this.wagePerHour = wagePerHour;
	}

	public int getWorkingDaysPerMonth() {
		return workingDaysPerMonth;
	}

	public void setWorkingDaysPerMonth(int workingDaysPerMonth) {
		this.workingDaysPerMonth = workingDaysPerMonth;
	}

	public int getWorkingHoursPerMonth() {
		return workingHoursPerMonth;
	}

	public void setWorkingHoursPerMonth(int workingHoursPerMonth) {
		this.workingHoursPerMonth = workingHoursPerMonth;
	}

	@Override
	public String toString() {
		return companyName + "\t" + wagePerHour + "\t\t" + workingDaysPerMonth + "\t\t" + workingHoursPerMonth + "\t\t";
	}
}

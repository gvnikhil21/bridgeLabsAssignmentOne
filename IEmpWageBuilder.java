package com.bridgeLabs.employeeWageProblem;

public interface IEmpWageBuilder {

	public void addCompany(String companyName, int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth);

	public Company[] getCompanyArray();

	public int calculateEmpWage(Company company);
}

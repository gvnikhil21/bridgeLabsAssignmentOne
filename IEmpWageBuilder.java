package com.bridgeLabs.employeeWageProblem;

import java.util.ArrayList;

public interface IEmpWageBuilder {

	public void addCompany(String companyName, int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth);

	public ArrayList<Company> getCompanyList();

	public int calculateEmpWage(Company company);
}

package com.bridgeLabs.employeeWageProblem;

import java.util.*;

public class EmpWageBuilder implements IEmpWageBuilder {
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
	ArrayList<Company> companyList = new ArrayList<Company>();
	HashMap<String, Integer> companyEmpWageMap = new HashMap<String, Integer>();

	public ArrayList<Company> getCompanyList() {
		return companyList;
	}

	// get total wage of an employee in a company by company name
	public Integer getCompanyEmpWageMap(String companyName) {
		if (companyEmpWageMap.containsKey(companyName))
			return companyEmpWageMap.get(companyName);

		return null;
	}

	// add company to companyList
	public void addCompany(String companyName, int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth) {
		companyList.add(new Company(companyName, wagePerHour, workingDaysPerMonth, workingHoursPerMonth));
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
		companyEmpWageMap.put(company.getCompanyName(), totalWage);
		return totalWage;
	}

	@Override
	public String toString() {
		return noOfHours + "\t\t" + noOfDays + "\t\t" + totalWage;
	}
}

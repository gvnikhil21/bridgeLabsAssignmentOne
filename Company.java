package employee;

public class Company {
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
	private int wagePerHour;
	private int workingDaysPerMonth;
	private int workingHoursPerMonth;
	private String companyName;

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

	public int getTotalWage() {
		return totalWage;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public int getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	// calculates employee wage till 100Hours/20Days whichever earlier is reached
	public void calculateEmpWage() {
		while (noOfHours < workingHoursPerMonth && noOfDays < workingDaysPerMonth) {
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
			if (noOfHours > workingHoursPerMonth)
				noOfHours = workingHoursPerMonth;
		}
		totalWage = noOfHours * wagePerHour;
	}
}
package oopsAssignmentSolition;

/*

Driver class Main will be used to create objects of HrDepartment, TechDepartment, AdminDepartment
→ Each department will display all its functionalities.
→ Each department  will display whether today is a holiday or not 
	with the help of the Super Department. (SuperDepartment will act as a super class for all the departments)

*/



 class Driver {

	public static void main(String[] args) {
		
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		
		admin.departmentName();
		admin.getTodaysWork();
		admin.getWorkDeadline();
		admin.isTodayAHoliday();
		
		
		hr.departmentName();
		hr.doActivity();
		hr.getTodaysWork();
		hr.getWorkDeadline();
		hr.isTodayAHoliday();
		
		
		tech.departmentName();
		tech.getTodaysWork();
		tech.getWorkDeadline();
		tech.getTechStackInformation();
		tech.isTodayAHoliday();
		
		
		
	}

}

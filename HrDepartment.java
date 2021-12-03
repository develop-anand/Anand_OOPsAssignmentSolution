package oopsAssignmentSolition;

/*
 * 
Hr department will contain 4 methods of return type String and will not accept any parameter
               i)  departmentName 
              ii)  getTodaysWork  
              iii) getWorkDeadline
              iv) doActivity

departmentName will return “ Hr Department “
getTodaysWork will return  “ Fill today’s timesheet and mark your attendance”
getWorkDeadline will return “ Complete by EOD “
doActivity “team Lunch”

*/

public class HrDepartment extends SuperDepartment {
	
	public void departmentName () {
		System.out.println(" Welcome to HR Department "); 
	}
	
	public void getTodaysWork () {
		System.out.println( " Fill today's timesheet and mark your attendance ");
	}
	
	public void getWorkDeadline () {
		System.out.println( " Complete by EOD ");
	}
	
	public void doActivity () {
		System.out.println( " team Lunch ");
	}
	
	
	
}
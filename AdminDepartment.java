package oopsAssignmentSolition;

/*
  
Admin department will contain 3 methods of return type String and will not accept any parameter
               i)  departmentName 
              ii)  getTodaysWork  
              iii) getWorkDeadline
              
departmentName will return “ Admin Department “
getTodaysWork will return “Complete your documents Submission”
getWorkDeadline will return “ Complete by EOD “

 */

public class AdminDepartment extends SuperDepartment {
	
	 public void departmentName() {
		System.out.println(" Welcome to Admin Department");
	
	}
	
	public void getTodaysWork() {
		System.out.println(" Complete your documents Submission ");
	}
	
	public void getWorkDeadline () {
		System.out.println(" Complete by EOD ");
	}
	
}

package oopsAssignmentSolition;
/*

Tech department will contain 4 methods of return type String and will not accept any parameter
               i)  departmentName 
              ii)  getTodaysWork  
              iii) getWorkDeadline
              iv) getTechStackInformation

departmentName will return “ Tech Department “
getTodaysWork will return  “ Complete coding of module 1”
getWorkDeadline will return “ Complete by EOD “
getTechStackInformation will return “core Java”

*/
public class TechDepartment extends SuperDepartment {
	
	public void departmentName () {
		System.out.println( " Welcome to Tech Department ");
	}
	
	public void getTodaysWork () {
		System.out.println( " Complete coding of module 1 ");
	}
	
	public void getWorkDeadline () {
		System.out.println( " Complete by EOD ");
	}
	
	public void getTechStackInformation () {
		System.out.println( " Core Java ");
	}
	
}

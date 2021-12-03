package oopsAssignmentSolition;

/*

Super department will contain 4 methods of return type String and will not accept any parameter
               i)  departmentName 
              ii)  getTodaysWork  
              iii) getWorkDeadline
              iv) isTodayAHoliday


departmentName will return “ Super Department “
getTodaysWork will return  “ No Work as of now”
getWorkDeadline will return “ Nil “
isTodayAHoliday will return “ Today is not a holiday”



 */



public class SuperDepartment {


	public void  departmentName() {
		System.out.println(" Super Department "); 
	}
	
	public void getTodaysWork (){
		System.out.println( " No Work as of now ");
	}
	
	public void getWorkDeadline() {
		System.out.println(" Nil "); 
	}
	
	public void isTodayAHoliday() {
		System.out.println(" Today is not a Holiday \n"); 
	}
	
}

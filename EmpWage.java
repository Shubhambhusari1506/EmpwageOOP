public class EmpWage {
	
		//constant
	public static final int IS_FULL_TIME = 1;

	public static final int IS_PART_TIME = 2;	

	public static final int emp_wage_per_hr = 20;



	public static void calwage(){

		//variables
	
	int emphrs, empwage;

	int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	
	switch (empCheck){
	
	case IS_FULL_TIME:

	System.out.println("employee is full time");
	
	emphrs = 8;

	break;

	case IS_PART_TIME:
	
	System.out.println("employee is part time");

	emphrs = 4;

	break;
	
	default:

	System.out.println("Employee is absent");

	emphrs = 0;
	}
		
	empwage = emphrs * emp_wage_per_hr;
	
	System.out.println("Employee daily wage is" +emphrs);
}

	public static void main (String[] args){

	calwage();
 }
}



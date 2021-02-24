public class EmpWage {
	
		//constant
	public static final int IS_FULL_TIME = 1;

	public static final int IS_PART_TIME = 2;	

	public static final int emp_wage_per_hr = 30;



	public static void calwage(){

		//variables
	
	int Emphrs, Empwage;

	int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	
	switch (empCheck){
	
	case IS_FULL_TIME:

	System.out.println("employee is full time");
	
	Emphrs = 8;

	break;

	case IS_PART_TIME:
	
	System.out.println("employee is part time");

	Emphrs = 4;

	break;
	
	default:

	System.out.println("Employee is absent");

	Emphrs = 0;
	}
		
	Empwage = Emphrs * emp_wage_per_hr;
	
	System.out.println("Employee daily wage is" +Empwage);
}

	public static void main (String[] args){

	calwage();
 }
}



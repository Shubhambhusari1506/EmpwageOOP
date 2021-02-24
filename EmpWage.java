public class EmpWage {
	
		//constant
	public static final int IS_FULL_TIME = 1;

	public static final int IS_PART_TIME = 2;	

	public static final int emp_wage_per_hr = 30;

	public static final int DAYS_IN_MONTH = 20;
	
	public static final int Max_hrs = 50;
	
//variables

	static int totalempwage;

	static int   calwage(){
	
	int totalworkingday = 1;

	int totalemphrs =0;
	
	while (totalworkingday != DAYS_IN_MONTH && totalemphrs <= Max_hrs){

	int emphrs, empwage;

	int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;
	
	if (empCheck ==IS_FULL_TIME){
	
	emphrs = 8;
	}
	else if (empCheck == IS_PART_TIME){
	emphrs = 4;
	}
	
	else{

	emphrs = 0;
  }
	
		
	empwage = emphrs * emp_wage_per_hr;

	totalempwage += empwage;

	totalemphrs += emphrs;

	System.out.println("Employee day" + totalworkingday + "wage  :" +empwage);

	totalworkingday++;
	
	}
  return totalempwage;
	
}

	public static void main (String[] args){

	calwage();
	
	System.out.println ("total employee wage :" +totalempwage);	

 }
}



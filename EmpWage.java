public class EmpWage {
	
		//constant
	public static final int IS_FULL_TIME = 1;

	public static final int IS_PART_TIME = 2;	

	public static final int emp_wage_per_hr = 30;

	public static final int DAYS_IN_MONTH = 20;
	
	public static final int Max_hrs = 50;
	


	static int   calwage(){
	
	int totalworkingday = 1;

	int totalemphrs =0;
	
	int emphrs = 0;
	

	while (totalworkingday != DAYS_IN_MONTH && totalemphrs <= Max_hrs){

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
	
	totalworkingday++;	
	
	int empwage = emphrs * emp_wage_per_hr;


	totalemphrs += emphrs;

	System.out.println("Employee day" + totalworkingday + "wage  :" +empwage);

	
	}

	int totalempwage = totalemphrs * emp_wage_per_hr;
	System.out.println("Total Employee Wage : " +totalempwage);
  return totalempwage;
	
}

	public static void main (String[] args){

	calwage();
	

 }
}



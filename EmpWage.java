public class EmpWage {


	public static final int  IS_FULL_TIME = 1;

	public static final int IS_PART_TIME = 2;



	public static int  computewage( String company, int emprateperhr, int workeddays, int maxhrs){

	//variables 

	int emphrs = 0, totalemphrs = 0, totalworkingdays = 0;

	//computation
	
	while (totalemphrs <= maxhrs && totalworkingdays < workeddays ){

	totalworkingdays++;

	int empCheck = (int) Math.floor (Math.random() * 10) % 3;

	switch (empCheck) {

	case IS_FULL_TIME:

	emphrs = 8;
	
	break;

	case IS_PART_TIME:

	emphrs = 4;

	break;

	default:

	emphrs = 0;

	}

	totalemphrs += emphrs;
	System.out.println("Day:   " + totalworkingdays + " employee hr : " +emphrs);

}

	int totalempwage = totalemphrs * emprateperhr;

	System.out.println ("Total employee wage for company :  " +company+ "is:"+totalempwage);
	
	return totalempwage;
}


	public static void main (String [] args) {

	computewage ("Dmart" ,20, 2, 10);
	computewage ("super mart", 30, 4, 20);
  }
}

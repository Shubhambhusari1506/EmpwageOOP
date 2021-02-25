public class EmpWage {

	//Constant
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	//Variables
	private final String companyname;
	private final int empwageperhr;
	private final int daysinmonth;
	private final int Maxhrs;
	private final int emphrsfulltime;
	private final int emphrsparttime;
	private int totalempwage;


	public  Empwage(String companyname, int empwageperhr, int daysinmonth, int Maxhrs, int emphrsfulltime, int emphrsparttime) {

		this.companyname = companyname;
		this.empwageperhr = empwageperhr;
		this.daysinmonth = daysinmonth;
		this.Maxhrs = Maxhrs;
		this.emphrsfulltime = emphrsfulltime;
		this.emphrsparttime = emphrsparttime;

	}

	public String toString(){
		return "Total Wage of: " + companyname + " Employee is: " + totalempwage ;
	}

	public void computewage() {

		//Variables
		int totalWorkingDays = 0;
		int totalemphrs = 0;
		int emphrs = 0;
		int Empwage = 0;

		//Computation
		while ( totalWorkingDays < daysinmonth && totalemphrs <= Maxhrs ) {

			int empCheck =(int) Math.floor(Math.random() * 10) % 3;
	
			if (empCheck == IS_FULL_TIME) {
	
			emphrs = emphrsfulltime;
			
			}else if (empCheck == IS_PART_TIME) {
			
			emphrs = emphrsparttime;
		
			}else {
		
			emphrs = 0;
	
			}
	
			totalWorkingDays ++;
	
			Empwage = emphrs * empwageperhr;
	
			totalemphrs += emphrs;
	
	
			totalempwage += Empwage;
	
			System.out.println("Employee day: " + totalWorkingDays + " Emp Hr: " + emphrs + " Wage: "+empwage);
		}

	}

	public static void main(String[] args){

	
		System.out.println("Welcome to Employee Wage Computation Program");
 	
		Empwage Dmart = new Empwage("Dmart", 20, 10, 50, 10, 5);
	
		Empwage BigBazaar = new Empwage("BigBazaar", 25, 14, 40, 12, 6);
	
		Empwage supermart = new Empwage("supermart", 20, 12, 40, 8, 4);

		System.out.println("Employee of Dmart");
	
		Dmart.computewage();
	
		System.out.println(Dmart);

		System.out.println("Employee of BigBazaar");
	
		BigBazaar.computewage();
	
		System.out.println(BigBazaar);

		System.out.println("Employee super Mart");
	
		supermart.computewage();
	
		System.out.println(supermart);

	}
}

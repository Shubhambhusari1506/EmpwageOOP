public class EmpWage {

   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;

   private final String company;
   private final int empRatePerHour;
   private final int numofworkingDays;
   private final int maxHourPerMonth;
   private int totalEmpWage;


   public EmpWage(String company, int empRatePerHour,int maxHourPerMonth, int numofworkingDays){

   this.company = company;
   this.empRatePerHour = empRatePerHour;
   this.numofworkingDays = numofworkingDays;
   this.maxHourPerMonth = maxHourPerMonth;
}

   public void computeEmpWage() {

   //variables
   int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
   //computation
   while (totalEmpHrs <= maxHourPerMonth && totalWorkingDays < numofworkingDays) {
      totalWorkingDays++;

   int empCheck = (int ) Math.floor(Math.random() *10) % 3;

   switch (empCheck) {

   case IS_PART_TIME:
   empHrs = 4;
   break;
   case IS_FULL_TIME:
   empHrs = 8;
   break;
   default:
   empHrs = 0;
   }
   totalEmpHrs += empHrs;
   System.out.println("DAY:" +totalWorkingDays + "EMP Hr:" +empHrs);
   }
   totalEmpWage = totalEmpHrs * empRatePerHour;
   }


   //override

   public String toString () {
   return "Total emp wage for company: " +company+ "is" +totalEmpWage;
}

   public static void main (String [] args){

   EmpWage dmart = new EmpWage("Dmart", 30, 2, 10);
   EmpWage relaince = new EmpWage("Reliance", 10, 4, 20);
   dmart.computeEmpWage();
   System.out.println(dmart);
   relaince.computeEmpWage();
   System.out.println(relaince);
}
}

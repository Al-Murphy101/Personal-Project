public class JFT4Ex3 {

	public static void main (String[] args)
	{
			String empName = "Alan Murphy";
			final String ppsNo = "7039871A";
			String departmentId = "Software Project Manager";
			
			float basicHours = 50.5f;
			float overTime = 13.5f;
			float basicRate = 29.35f;
			float totalWage = basicHours * basicRate;
			float overTimeRate = basicRate * 1.5f;
			float totalOT = overTimeRate * overTime;
			float gross = totalWage + totalOT;
			
			float tax = 0.35f;
			float totalTax = gross * tax;
			float netPay = gross - totalTax;
			
			System.out.println("");
			System.out.println("*****************Salay Report*****************");
			System.out.println("");
			System.out.println("***************Emplyee Details****************");
			System.out.println("Employee Name: " + empName);
			System.out.println("Employee PPS No: " + ppsNo);
			System.out.println("Employee Department: " +departmentId);
			System.out.println("");
			System.out.println("*****************Hours Worked*****************");
			System.out.println("No. of basic hours worked: " + basicHours);
			System.out.println("The hourly rate for pay is at " + basicRate + " euro");
			System.out.println("Basic salry: " + totalWage);
			System.out.println("No. of overtime hours worked: " + overTime);
			System.out.println("The hourly rate for overtime is time and a half at: " +overTimeRate);
			System.out.println("Overtime salary: " + totalOT);
			System.out.println("");
			System.out.println("*****************Take Home Pay*****************");
			System.out.println("Gross Pay: " + gross);
			System.out.println("Income Tax Payable at: 35% is: " + totalTax);
			System.out.println("Net Pay: " + netPay);
			System.out.println("***********************************************");
	}
}
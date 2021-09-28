import java.util.Scanner;
import java.text.DecimalFormat;

public class  JFT13Ex4
{
	public static void main(String[] args)
	{
		//create scanner object
		Scanner scan = new Scanner(System.in);
		
		//create decimal format object;
		DecimalFormat dec = new DecimalFormat();
		
		String name;
		String PPS;
		String department;
		
		
		
		
		float hourlyRate = 29.39f;
		float overTimeRate = 1.5f;
		float hoursWorked = 0.0f;
		float overTime = 0.0f;
		
		float basicSalary = 0.0f;
		float overtimeSalary = 0.0f;
		float salary = 0.0f;
	
		
		float over2K = 0.0f;
		float under2K = 0.0f;
		float max = 2000.00f;
		
		
		float taxOver2K = 0.35f;
		float taxUnder2K = 0.20f;
		
		System.out.println("Please enter your name: ");
		name = scan.nextLine();
		//System.out.println(name);
		
		System.out.println("Please enter your PPS No: ");
		PPS = scan.nextLine();
		
		System.out.println("Please enter the department where you work: ");
		department = scan.nextLine();
		
		System.out.println("Please enter your basic hours: ");
		hoursWorked = scan.nextFloat();
		
		System.out.println("Please enter your overtime worked: ");
		overTime = scan.nextFloat();
		
		basicSalary = (hoursWorked * hourlyRate);
		overtimeSalary = (overTime * (hourlyRate * overTimeRate));
		
		salary = (basicSalary + overtimeSalary);
		
		System.out.println("*******************SALARY REPORT*********************");
		System.out.println();
		System.out.println("******************EMPLOYEE DETAILS*******************");
		System.out.printf("Employee Name: %s%n", name);
		System.out.printf("Employee PPS No: %s%n", PPS);
		System.out.printf("Employee Department: %s%n", department);
		System.out.println();
		System.out.println("*******************HOURS WORKED**********************");
		System.out.printf("No of Basic Hours: %.2f%n", hoursWorked);
		System.out.printf("The hourly raye of basic pay is at %.2f euro.%n", hourlyRate);
		System.out.printf("Basic salary is: %.2f%n", basicSalary);
		System.out.printf("The hourly rate of basic pay is at time and a half.%n");
		System.out.printf("Overtime salary: %.2f%n", overtimeSalary);
		
		
		System.out.println();
		System.out.println("******************TAKE HOME PAY**********************");
		System.out.printf("Gross Pay: %.2f%n", salary);
		if(salary > max)
		{
			over2K = salary * taxOver2K;
			System.out.printf("Income tax payable at 35 percent: %.2f%n", over2K);
			salary = (salary - over2K);
			
			System.out.printf("Net Pay: %.2f%n", salary);
			System.out.println();
			System.out.println("*************************************************");
		}
		else
		{
			under2K = (salary * taxUnder2K);
			System.out.printf("Income tax payable at 20 percent: %.2f%n", under2K);
			salary = (salary - under2K);
			
			System.out.printf("Net Pay: %.2f%n", salary);
			System.out.println();
			System.out.println("*************************************************");
		}
		
		
		
	}
}
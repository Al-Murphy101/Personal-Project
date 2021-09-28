public class  JFT7Ex2
{
	public static void main(String args [])
	{
		double [] salary = {24000.50f, 30432.54f, 29454.54f, 45000.00f, 20500.00f};
		
		System.out.println(salary[0]);
		System.out.println(salary[1]);
		System.out.println(salary[2]);
		System.out.println(salary[3]);
		System.out.println(salary[4]);
		
		System.out.println("There are " + salary.length + " number of employees");
		
		System.out.println("");
		System.out.println("");
		System.out.println("Altenative way to code");
		
		//coventional way to declare and populate the array
		float [] empWages = new float[5];
		//assign values to elements
		empWages[0] = 24000.50f;
		empWages[1] = 30432.54f;
		empWages[2] = 29454.54f;
		empWages[3] = 45000.00f;
		empWages[4] = 20500.00f;
		
		int i = 0;
		System.out.println(salary[i++]);
		System.out.println(salary[i++]);
		System.out.println(salary[i++]);
		System.out.println(salary[i++]);
		System.out.println(salary[i++]);
		
		System.out.println("There are " + empWages.length + " employees");
		
	}
}
public class JFT7Ex5
{
	public static void main(String args [])
	{
		String [] names = new String[3];
		int [] age = new int[3];
		String [] courses = new String[3];
		
		names[0] = "John Hayes";
		age[0] = 30;
		courses[0] = "Sports Science";
		
		names[1] = "Michael Smyth";
		age[1] = 24;
		courses[1] = "Law";
		
		names[2] = "Frankie Walsh";
		age[2] = 24;
		courses[2] = "Computer Science";
		
		System.out.println("Name: " + names[0] + "\t" + "Age: " + age[0] + "\t\t" + "Degree: " + courses[0]);
		System.out.println("Name: " + names[1] + "\t" + "Age: " + age[1] + "\t\t" + "Degree: " + courses[1]);
		System.out.println("Name: " + names[2] + "\t" + "Age: " + age[2] + "\t\t" + "Degree: " + courses[2]);
	}
}
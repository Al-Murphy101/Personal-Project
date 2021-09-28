public class  JFT12Ex10
{
	public static void main(String[] args)
	{
		String name = "		Christopher Brown.	";
		System.out.println(name);
		System.out.println("The no. of chars in the name: " + name + "is " + name.length());
		System.out.println();
		name = name.trim();
		System.out.println(name);
		System.out.println("The no. of chars in the name: " + name + "is " + name.length());
	}
}
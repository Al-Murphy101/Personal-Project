public class Demo1{
	public static void main (String[] args)
	{
		Demo1 obj = new Demo1();
		obj.methodOne();
	}
	
	public void methodOne()
	{
		int x = 10;
		
		System.out.println("Method One");
		System.out.println("x = " +x);
		methodTwo(x);
	}
	
	public void methodTwo(int x)
	{
		x = 20;
		System.out.println("Method Two");
		System.out.println("x = " +x);
	}
}
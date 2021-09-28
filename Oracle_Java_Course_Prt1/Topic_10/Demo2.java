public class Demo2{
	public static void main (String[] args)
	{
		Demo2 obj = new Demo2();
		obj.methodOne();
	}
	
	public void methodOne()
	{
		int a = 100;
		methodTwo(a);
		System.out.println("Method One");
		System.out.println("x = " +a);
		
	}
	
	public void methodTwo(int x)
	{
		x = 200;
		System.out.println("Method Two");
		System.out.println("x = " +x);
	}
}
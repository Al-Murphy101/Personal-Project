public class Demo3{
	public static void main (String[] args)
	{
		Demo3 obj = new Demo3();
		obj.methodOne();
	}
	
	public void methodOne()
	{
		DogDemo3 obj = new DogDemo3();
		obj.setName("Patches");
		
		methodTwo(obj);
		System.out.println(obj.getName());
		
	}
	
	public void methodTwo(DogDemo3 obj)
	{
		obj.setName("Timmy");
	}
}
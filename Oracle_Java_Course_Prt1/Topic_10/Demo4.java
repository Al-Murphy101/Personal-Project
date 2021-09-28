public class Demo4{
	public static void main (String[] args)
	{
		Demo4 obj = new Demo4();
		obj.methodOne();
	}
	
	public void methodOne()
	{
		RobotDemo4 mrData = new RobotDemo4();
		mrData.setAge(15);
		
		methodTwo(mrData);
		System.out.println(mrData.getAge());
		
	}
	
	public void methodTwo(RobotDemo4 mrData)
	{
		mrData.setAge(128);
	}
}
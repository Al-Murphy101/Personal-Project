public class Test
{
	public static void main(String[] args)
	{
		Televison tv1 = new Televison();
		tv1.setOn_Off(true);
		tv1.setChannel(100);
		tv1.setVolume(5);
		
	
		tv1.channelUp();
		tv1.channelDown();
		tv1.volumeUp();
		tv1.volumeUp();
		tv1.setOn_Off(false);
		System.out.println(tv1.toString());
	}
	
}
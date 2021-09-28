public class Main
{
	public static void main(String[] args)
	{
		//set human ingeruted instance variables
		Adult h1 = new Adult();
		h1.setName("Billy White");
		h1.setAge(30);
		h1.setGender("Male");
		h1.setHeight(6.5f);
		h1.setWeight(11.0f);
		
		//set adult instance variables
		h1.setPPSno("645654F");
		h1.setOccupation("Software Developer");
		h1.setIsMarried(true);
		h1.setIsCarOwner(true);
		System.out.println(h1.toString());
		System.out.println();
		
		Child c1 = new Child();
		
		c1.setName("Frank Davis");
		c1.setAge(3);
		c1.setGender("Male");
		c1.setHeight(1.5f);
		c1.setWeight(3.0f);
		
		System.out.println(c1.toString());
		System.out.println(c1.eat());
		System.out.println(c1.swim());
		System.out.println();
		
		Baby b1 = new Baby();
		b1.setName("Amber lily");
		b1.setAge(1);
		b1.setGender("Female");
		b1.setHeight(0.6f);
		b1.setWeight(1.0f);
		b1.setIsTeething(true);
		System.out.println(b1.toString());
		System.out.println(b1.sleep());
		System.out.println(b1.swim());
		System.out.println();
		
		
		
		
		
	}
}
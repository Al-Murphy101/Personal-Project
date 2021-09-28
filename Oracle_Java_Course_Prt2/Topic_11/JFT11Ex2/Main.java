public class Main
{
	public static void main (String[] args)
	{
		//four argument coinstructor
		Car c1 = new Car("Subaru Hatchback", 53.45f, "98 D 4545", true);
		
		System.out.println(c1.toString());
		System.out.println(c1.brake());
		System.out.println(c1.accelerate());
		System.out.println();
		
		//using the no-arg constructor and setter and getter methods
		Car c2 = new Car();
		c2.setManufacturer("Toyota Corolla");
		c2.setEngineSize(54.54f);
		c2.setRegNo("90 D 1234");
		c2.setNCT(true);
		
		System.out.println(c2.toString());
		System.out.println(c2.brake());
		System.out.println(c2.accelerate());
		System.out.println();
		
		System.out.println(Car.getCarObjectCreated() + " have been created!");
		System.out.println();
		
		//truck constructor using the one args constructor
		Truck t1 = new Truck("Ford Transit");
		System.out.println(t1.toString());
		System.out.println(t1.brake());
		System.out.println(t1.accelerate());
		System.out.println();
		
		//truck constructor using the one args constructor with getter and setter methods
		Truck t2 = new Truck();
		t2.setManufacturer("Hyundai Pick-Up");
		t2.setEngineSize(89.45f);
		t2.setRegNo("99 C 1234");
		t2.setNCT(true);
		t2.setIsTrailer(false);
		System.out.println(t2.toString());
		System.out.println(t2.brake());
		System.out.println(t2.accelerate());
		System.out.println();
	}
}
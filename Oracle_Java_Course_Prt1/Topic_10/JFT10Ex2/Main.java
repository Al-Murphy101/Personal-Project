public class Main
{
	public static void main(String[] args)
	{
		Jelly j1 = new Jelly();
		j1.manufacturer = "Chivery";
		j1.price = 3.50f;
		j1.flavour = "Strawberry";
		j1.noCalories = 24f;
		j1.expiryDate = "25/06/2021";
		
		Jelly j2 = new Jelly();
		j2.manufacturer = "Nestles";
		j2.price = 3.42f;
		j2.flavour = "Banana";
		j2.noCalories = 26f;
		j2.expiryDate = "27/07/2021";
		
		Jelly j3 = new Jelly();
		j3.manufacturer = "Chivery";
		j3.price = 3.50f;
		j3.flavour = "Strawberry";
		j3.noCalories = 24f;
		j3.expiryDate = "25/06/2021";
		
		
		System.out.println(j1.toString());
		System.out.println(j1.setInstructions());
		System.out.println();
		
		System.out.println(j2.toString());
		System.out.println(j2.setInstructions());
		System.out.println();
		
		System.out.println(j3.toString());
		System.out.println(j3.setInstructions());
		System.out.println();
	}
}
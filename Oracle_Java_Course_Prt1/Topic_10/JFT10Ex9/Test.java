public class Test
{
	public static void main(String[] args)
	{
		
	Smartphone sp1 = new Smartphone();
	sp1.name = "Nooks 610";
	sp1.manufacturer = "Nooks";
	sp1.price = 100.00f;
	sp1.releaseDate = "04/06/2020";
	sp1.creditRemaining = 0.00f;
	sp1.isFullyCharged = false;
	
	//static variables count up
	Smartphone.noOfPhones ++;
	Smartphone.totalPrice += sp1.price;
	
	Smartphone sp2 = new Smartphone();
	sp2.name = "HC3 Sensation";
	sp2.manufacturer = "HC3";
	sp2.price = 110.00f;
	sp2.releaseDate = "14/07/2020";
	sp2.creditRemaining = 0.00f;
	sp2.isFullyCharged = false;
	
	Smartphone.noOfPhones ++;
	Smartphone.totalPrice += sp2.price;
	
	Smartphone sp3 = new Smartphone();
	sp3.name = "Samsung Desire";
	sp3.manufacturer = "Samsung";
	sp3.price = 190.00f;
	sp3.releaseDate = "14/08/2020";
	sp3.creditRemaining = 0.00f;
	sp3.isFullyCharged = false;
	
	Smartphone.noOfPhones ++;
	Smartphone.totalPrice += sp3.price;
	
	sp1.topUpCredit(15.00f);
	sp1.charge();
	System.out.println();
	System.out.println(sp1.toString());
	System.out.println();
	System.out.println(sp2.toString());
	System.out.println();
	System.out.println(sp3.toString());
	System.out.println();
	
	System.out.println(Smartphone.noOfPhones + " smartphone items have been created");
	System.out.println("The average price of a smartphone is: " + Smartphone.getAverage());
	}
	
}
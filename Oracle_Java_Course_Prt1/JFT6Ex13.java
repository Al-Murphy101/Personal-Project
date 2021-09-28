public class JFT6Ex13
{
	public static void main (String args [])
	{
		byte noOfMiles = 20;
		String water = "Water break is available!";
		String noWater = "No water break is available!";
		
		/*switch (noOfMiles)
		{
			case 5:
				System.out.println(water);
			break;
			
			case 10:
				System.out.println(water);
			break;
			
			case 15:
				System.out.println(water);
			break;
			
			case 20:
				System.out.println(water);
			break;
			
			case 25:
				System.out.println(water);
			break;
			
			default:
				System.out.println(noWater);
			
		}*/
		
		if (noOfMiles == 5)
		{
			System.out.println(water);
		}
		
		else if (noOfMiles == 10)
		{
			System.out.println(water);
		}
		
		else if (noOfMiles == 15)
		{
			System.out.println(water);
		}
		
		else if (noOfMiles == 20)
		{
			System.out.println(water);
		}
		
		else if (noOfMiles == 25)
		{
			System.out.println(water);
		}
		
		else 
		{
			System.out.println(noWater);
		}
		
	}
}
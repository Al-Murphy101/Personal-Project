import java.util.Random;

public class StartingPoint{
	
	public static void main(String trav[]){
		int dice = 0;
		
		Random r = new Random();
		
		dice = r.nextInt(6) + 1;
		//System.out.print(dice);
		
		double randoms = r.nextDouble();
		double num = randoms * 1000;
		int ourNum = (int) num;
		System.out.println(randoms);
		System.out.println(ourNum);
		
		
	}
}
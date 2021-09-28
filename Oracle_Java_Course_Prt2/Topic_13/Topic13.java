import java.util.Random;
public class Topic13{
 public static void main(String[] args){
 // Create a random object
 Random r = new Random();

 // Create an array to hold byte variables
 byte[] myBytes = new byte[3];

 // Call the nextBytes method of the Random class, pass it an array of bytes.
 r.nextBytes(myBytes);

 // Use an enhanced for loop to see the random byte values generated.
 for(byte b:myBytes){
 System.out.println(b);
 }

 }// main
}// class

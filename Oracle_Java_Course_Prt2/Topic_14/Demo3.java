public class Demo3{
 public static void main(String[] args){
 String num = "two";
 
 try{
 int x = Integer.parseInt(num);
 }catch (NumberFormatException e){
 System.out.println("Problem parsing data.");
 }
 
 // NumberFormatException is generated.
 }// main
}// class
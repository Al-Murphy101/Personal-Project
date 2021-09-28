//Fibonacci Sequence
public class Fibonacci{
    public static void main(String[] args){
        //intialise the constants
        int n = 100; 
        int t1 = 0;
        int t2 = 1;

        System.out.println("Up to "+ n + ": ");
        //While loop to calculate fibonacci up to n numbers
        while(t1 < n){
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
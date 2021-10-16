public class FizzBuzz{

    static int count = 20;
    static int fizz = 3;
    static int buzz = 5;
    static int iter;

    public static void main(String[] args) {
        
        for(iter = 1; iter <= count; iter ++){
            if(iter % fizz == 0 && iter % 5 == 0){
                System.out.println("FIZZBUZZ");
            }
            else if(iter % fizz == 0){
                System.out.println("FIZZ");
            }
            else if(iter % buzz == 0){
                System.out.println("BUZZ");
            }
            else{
                System.out.println(iter);
            }
        }
    }
}
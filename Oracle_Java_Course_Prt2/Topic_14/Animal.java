public class Animal{
 private float height;
 private float weight;

 public Animal(float height, float weight){
   this.height=height;
   this.weight=weight;
 }

 public String toString(){
  return "Height: " + height + "\n" + "Weight: " + weight;
 }
}



public class Baboon extends Animal{

  public Baboon(float height, float weight){
   super(height,weight);
  }

  public Baboon(){
   this(0,0);
  }

  public static void main(String[] args){
   Baboon baboon = new Baboon(0.7f,4.4f);
   System.out.println(baboon);
  }
}
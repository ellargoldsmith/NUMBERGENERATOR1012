
import java.util.Random;

public class RandomMath {

   public static void main(String[] args){
      System.out.println(RandIntUsingMath());
      System.out.println(RandIntUsingMath());
      System.out.println(RandIntUsingMath());
      System.out.println(RandObject());
      System.out.println(RandObject());
      System.out.println(RandObject());
   }
   
   public static int RandIntUsingMath(){
      //returns a random integer between 0 and 50 (inclusive using the Math.random() method
      double randomDouble = Math.random();
      int randomInt;
      
      randomDouble = Math.random();
      randomInt = (int) (randomDouble * 51);
      
      return (randomInt);
   }

   public static int RandObject() {
      //returns a random integer between 0 and 50 (inclusive) using the Random class
      int randomInt;
       
      Random randomObject = new Random();
      randomInt = randomObject.nextInt(0,50);
      
      return randomInt;
   }
}
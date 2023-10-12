// Ella Goldsmith, Ap CS, Oct 10, 2023
// In this program I will be generating 6 random numbers between 0 and 50.
import java.util.Random;

public class NumberGenerator {

   public static void main(String[] args) {
   
// Code for generating random numbers using Math.random.     
      int min = 0;
      int max = 50;
      
      int a = (int)(Math.random()*(max-min)+min);
      int b = (int)(Math.random()*(max-min)+min);
      int c = (int)(Math.random()*(max-min)+min);
// Code for generating random numbers using a Random object.      
      Random random = new Random();
      int x = random.nextInt(50);
      int y = random.nextInt(50);
      int z = random.nextInt(50);
      
// First three random numbers printed out using Math.random.     
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
//Last three random numbers printed out using a Random object.     
      System.out.println(x);
      System.out.println(y);
      System.out.println(z);
      
      
  }
}
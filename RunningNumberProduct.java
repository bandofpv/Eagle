package eagles;

public class RunningNumberProduct {
	   public static void main(String[] args) {
	   int lowerbound5 = 1;
	   int upperbound5 = 10;
	   
	   int number5 = lowerbound5;
	   int product5 = 1;
	      while (number5 <= upperbound5) {
	         product5 = product5 * number5;  // Accumulate number into sum
	         ++number5;            // Next number
	      }
	      System.out.println("The product from " + lowerbound5 + " to " + upperbound5 + " is " + product5);//EXERCISE 5
	   }
}

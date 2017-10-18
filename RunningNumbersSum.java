package eagles;

public class RunningNumbersSum {

	public static void main(String[] args) {
		      int lowerbound1 = 9;      // Store the lowerbound
		      int upperbound1 = 888;   // Store the upperbound
		      int lowerbound2 = 1;
		      int upperbound2 = 1000;
		      int lowerbound3 = 0;
		      int upperbound3 = 1000;
		      int lowerbound4 = 1;
		      int upperbound4 = 100;
		      int sum1 = 0;   // Declare an int variable "sum" to accumulate the numbers
		                     // Set the initial sum to 0
		      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
		      int number1 = lowerbound1;
		      while (number1 <= upperbound1) {
		         sum1 = sum1 + number1;  // Accumulate number into sum
		         ++number1;            // Next number
		      }
		      System.out.println("The sum from " + lowerbound1 + " to " + upperbound1 + " is " + sum1);//EXERCISE 1
		      int number2 = lowerbound2;
		      int sum2 = 0; 
		      while (number2 <= upperbound2) {
			         sum2 = sum2 + number2;  // Accumulate number into sum
			         number2 = number2 + 2;            // Next number
			      }
		      System.out.println("The sum from " + lowerbound2 + " to " + upperbound2 + " is " + sum2);//EXERCISE 2
		 
		       int number3 = lowerbound3;
		       int sum3 = 0;
		      while (number3 <= upperbound3) {
			         sum3 = sum3 + number3;  // Accumulate number into sum
			         number3 = number3 + 7;            // Next number
			      }
		      System.out.println("The sum from " + lowerbound3 + " to " + upperbound3 + " is " + sum3);//EXERCISE3
		      
		      int number4 = lowerbound4;
		       int square4 = 0;
		      while (number4 <= upperbound4) {
			         square4 = number4*number4+square4;  // Accumulate number into square
			         
			         number4 ++;            // Next number
			      }
		      System.out.println("The square from " + lowerbound4 + " to " + upperbound4 + " is " + square4);//EXERCISE4
		      
		   }

}

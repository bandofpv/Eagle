package eagles;

public class OddEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lowerbound = 1, upperbound = 1000;  // lowerbound and upperbound
	      int sum  = 0;    // For accumulating odd numbers, init to 
	      int number = lowerbound;
	      while (number <= upperbound) {
	         if (number % 30 !=0) {  // Even
	              
	         } else if((number % 13 == 0)||(number % 15 == 0)||(number% 17 == 0)){
	            sum = sum+number;	 
	             }
	         
	         ++number;  // Next number
	      } 
	      // Print the result
	      System.out.println("The sum numbers divisible by 13 15 or 17 but not 30 from " + lowerbound + " to " + upperbound + " is " + sum);
	     	

		int firstYear = 1;
		int secondYear = 2010;
		int count = 0 ;
		while (firstYear <= secondYear) {
			if (secondYear % 4 == 0) {
				count++;
				System.out.println(firstYear);
				
			}
			firstYear++;
		}
	}
}

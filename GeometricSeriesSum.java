package eagles;

public class GeometricSeriesSum {
	public static void main (String[] args) {
		  int numTerms = 1000;
		  double sum = 0.0;
		  int numerator = 1;
		  int denominator = 1;
		  while(denominator <= numTerms){
			  sum += (double)numerator/denominator;
			  denominator *= 2;
		  }
		  System.out.println("The sum is " + sum);
	  }

}

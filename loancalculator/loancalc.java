import java.util.Scanner;

public class loancalc {
	public static void main(String[] args) throws Exception {
		double principal, interestRate, years, emi;
		Scanner in = new Scanner(System.in);

		System.out.println ("Please enter the principal amount ($): ");
		principal = in.nextDouble ();
		System.out.println ("Please enter the interest rate (%): ");
		interestRate = in.nextDouble ();
		System.out.println ("Please enter the loan period in years: ");
		years = in.nextDouble ();
		
		double r = interestRate/12/100;
		emi = Math.round((principal*((r*Math.pow(1+r,years*12))/(Math.pow(1+r,years*12)-1)))*100)/100.00;
		System.out.println ("Your monthly instalment is $"+emi);
	}
}
package com.bridgelab.juittestingprograms;

public class MonthlyPayment {
	// static variables
	public static double r, n, payment, principalAmount, rate, years;

	/*
	 * Calculating monthly payment
	 */
	public static void monthlyPaymentComputation(double principalAmount, double rate, double years) {
		r = rate / (12 * 100);
		n = 12 * years;
		payment = (principalAmount * r) / (1 - Math.pow(1 + r, -n));
		System.out.println("Monthly Payment: " + payment);
	}

	public static void main(String[] args) {
		// command-line arguments
		principalAmount = Double.parseDouble(args[0]);
		rate = Double.parseDouble(args[1]);
		years = Double.parseDouble(args[2]);
		// calling method
		monthlyPaymentComputation(principalAmount, rate, years);
	}

}

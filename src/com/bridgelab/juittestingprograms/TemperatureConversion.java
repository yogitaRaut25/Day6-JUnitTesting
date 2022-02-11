package com.bridgelab.juittestingprograms;

import java.util.Scanner;

public class TemperatureConversion {
	public static void tempConversion() {
		int ch;
		double Celsius;
		double Farhenite;
		System.out.println("Enter the Type of Conversion");
		System.out.println("Press '1' Farhenite to celsius");
		System.out.println("Press '2' Celsius to Farhenite");

		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();

		switch (ch) {
		case 1:
			System.out.println("Enter Temperature in Celsius");
			Celsius = sc.nextDouble();
			double result1 = farhenite(Celsius);// calling method
			System.out.println("Temperature in Farhenite= " + result1);
			break;

		case 2:
			System.out.println("Enter Temperature in Farhenite");
			Farhenite = sc.nextDouble();
			double result2 = celsius(Farhenite);// calling method
			System.out.println("Temperature in Celsius = " + result2);
			break;

		default:
			System.out.println("Enter valid choice");
		}
		sc.close();
	}

	public static double farhenite(double Celsius) {
		return (Celsius * 9 / 5) + 32;
	}

	public static double celsius(double Farhenite) {
		return (Farhenite - 32) * 5 / 9;
	}

	public static void main(String[] args) {
		// calling method
		tempConversion();
	}
}
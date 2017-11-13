//FizzBuzz problem : Write a Java program that prints the numbers from 1 to 50. 
//But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". 
//For numbers which are multiples of both three and five print "FizzBuzz"

package com.exercise.java.programs;

public class FizzBuzz {

	public static void main(String args[]) {

		System.out.println("Printing the numbers from 1 to 50");

		// Use for loop to print the numbers
		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0 && i % 5 != 0) {

				System.out.println("FIZZ");

			} else if (i % 5 == 0 && i % 3 != 0) {

				System.out.println("BUZZ");

			} else if (i % 3 == 0 && i % 5 == 0) {

				System.out.println("FIZZBUZZ");

			} else {

				System.out.println(i);
			}

		}

	}

}

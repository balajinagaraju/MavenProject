package com.exercise.java.programs;

public class ReverseString {

	public static void main(String args[]) {

		String Name = "BalajiNagaraju";
		char[] NewName = Name.toCharArray();
		char[] ReversedName = {};
		for (int i = 0; i < NewName.length; i++) {

			for (int j = NewName.length; j == 0; j--) {

				ReversedName[j] = NewName[i];

			}

		}

		System.out.println(ReversedName.toString());
	}

}

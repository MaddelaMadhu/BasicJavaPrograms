package com.madhu.basic.program;

import java.util.Scanner;

public class SwappingLogic {
	
	public static void main(String[] args) {
		SwappingLogic logic = new SwappingLogic();
		logic.SelectNumbers();

	}

	public void SelectNumbers() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstnumber = s.nextInt();
		System.out.println("Enter the second number");
		int secondnumber = s.nextInt();
		s.close();
		System.out.println("Before swapping");
		System.out.println("First number is:" + firstnumber + "second number is:" + secondnumber);
		System.out.println("==============");
		System.out.println("swapping number without using temp variable");
		swappingNumbers(firstnumber, secondnumber);
		System.out.println("swapping number  using temp variable");
		swappingNumbersusingtemp(firstnumber, secondnumber);
		
	}

	private void swappingNumbersusingtemp(int firstnumber, int secondnumber) {
		firstnumber = firstnumber + secondnumber;
		secondnumber = firstnumber - secondnumber;
		firstnumber = firstnumber - secondnumber;
		System.out.println("First number is:" + firstnumber + "second number is:" + secondnumber);
		System.out.println("==============");
	}

	private void swappingNumbers(int firstnumber, int secondnumber) {
		int temp = firstnumber;
		firstnumber = secondnumber;
		secondnumber = temp;
		System.out.println("First number is:" + firstnumber + "second number is:" + secondnumber);
		System.out.println("==============");
	}
}

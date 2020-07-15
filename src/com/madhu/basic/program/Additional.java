package com.madhu.basic.program;

import java.util.Scanner;

public class Additional {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int a, b, number;
		a = s.nextInt();
		b = s.nextInt();
		number = a + b;
		System.out.println("Addition of two numbers=" + number);
		s.close();
	}

}

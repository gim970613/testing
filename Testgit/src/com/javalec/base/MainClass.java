package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Calc;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 : ");
		int num1 = scanner.nextInt();
		System.out.println("두번째 : ");
		int num2 = scanner.nextInt();
		
		Calc calc = new Calc(num1, num2);
		
		System.out.println("123");

	}

}

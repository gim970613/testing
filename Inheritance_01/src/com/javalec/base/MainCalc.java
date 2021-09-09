package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Div;

public class MainCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("first number : ");
		int num1=scanner.nextInt();
		System.out.print("second number : ");
		int num2=scanner.nextInt();
		
		System.out.println(">>>result<<<");
		Div div = new Div(num1,num2);
		
//		div.addNum(num1,num2);
//		div.subNum(num1,num2);
//		div.mulNum(num1,num2);
//		div.divNum(num1,num2);
		

	}

}

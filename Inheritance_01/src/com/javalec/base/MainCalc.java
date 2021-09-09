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
		
		Div div = new Div();
		System.out.println(">>>>결과<<<<");
		System.out.println("덧셈 : "+div.addNum(num1,num2));
		System.out.println("뺄셈 : "+div.subNum(num1,num2));
		System.out.println("곱셈 : "+div.mulNum(num1,num2));
		System.out.println("나눗셈 : "+div.divNum(num1,num2));
//		div.addNum(num1,num2);
//		div.subNum(num1,num2);
//		div.mulNum(num1,num2);
//		div.divNum(num1,num2);
		

	}

}

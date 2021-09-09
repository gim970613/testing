package com.javalec.function;

public class Mul extends Sub {
	

	
	public Mul(int num1, int num2) {
		super(num1, num2);
	}


	public void mulNum() {
		int mul = num1 * num2;
		System.out.println("mul : "+mul);
	}
}

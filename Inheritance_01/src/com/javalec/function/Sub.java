package com.javalec.function;

public class Sub extends Add {
	

	public Sub(int num1,int num2) {
		super(num1, num2);
	}
	
	public void subNum() {
		int sub = num1-num2;
		System.out.println("sub : "+sub);
	}
	
	
}

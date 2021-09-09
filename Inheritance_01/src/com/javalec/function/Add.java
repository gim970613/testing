package com.javalec.function;

public class Add {

	int num1,num2;

	

	public Add(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}



	public void addNum() {
		int add = num1+num2;
		System.out.println("add : "+add);
	}
	
}

package com.javalec.function;

public class Div extends Mul {


	public Div(int num1, int num2) {
		super(num1, num2);
		addNum();
		subNum();
		mulNum();
		divNum();
	}

	public void divNum() {
		double div = (double)num1/num2;
		System.out.println("div : "+div);
	}
}

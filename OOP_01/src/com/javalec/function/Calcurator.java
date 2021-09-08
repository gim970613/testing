package com.javalec.function;



public class Calcurator {

	//필드
	int num1=0,num2=0;
	//퍼블릭
	public Calcurator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	//메소드
	public void divcal() {
		System.out.println("나눗셈 : "+(num1/num2));
		
	}
	public void doucal() {
		System.out.println("곱셈 : "+(num1*num2));	
		
	}
}

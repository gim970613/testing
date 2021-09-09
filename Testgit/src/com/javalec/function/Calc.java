package com.javalec.function;
import com.javalec.function.AAD;
public class Calc {
	int num1,num2;
	

	public Calc(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		compute();
	}
	DEL del = new DEL(num1,num2);
	GOB gob = new GOB(num1,num2);
	NANU nanu = new NANU(num1,num2);

	
	private void compute() {
		AAD add = new AAD(num1,num2);
		DEL del = new DEL(num1,num2);
		GOB gob = new GOB(num1,num2);
		NANU nanu = new NANU(num1,num2);
		System.out.println(add.Add());
		System.out.println(del.Del());
		System.out.println(gob.Gob());
		System.out.println(nanu.Nanu());
		
	}
	
}

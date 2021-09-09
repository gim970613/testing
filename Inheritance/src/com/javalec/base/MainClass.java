package com.javalec.base;

import com.javalec.function.Child;

public class MainClass {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		System.out.println("아버님 성명 :");
		child.getFather();
		System.out.println("어머님 성명 :");
		child.getMother();
		
		System.out.println("내이름 :");
		child.getMe();
	}

}

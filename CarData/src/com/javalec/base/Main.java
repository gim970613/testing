package com.javalec.base;

import com.javalec.function.DmbCellPhone;

public class Main {

	public static void main(String[] args) {

		// Instance 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		// 상속받은 필드 출력
		System.out.println(" >>>>>> 부모 필드 <<<<<<< ");
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		System.out.println("---------------------------------------");
		
		// DmbCellPhone의 필드 출력
		System.out.println(" >>>>>> 자식 필드 <<<<<<< ");
		System.out.println("채널 : " + dmbCellPhone.channel);
		System.out.println("---------------------------------------");
		
		// 상속받은 Method 호출
		System.out.println(" >>>>>> 부모 Method <<<<<<< ");
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동 인데요");
		dmbCellPhone.sendVoice("아! 반갑습니다. 그럼 안녕히~~~");
		System.out.println("---------------------------------------");
		
		// dmbCellPhone의 Method 호출
		System.out.println(" >>>>>> 자식 Method <<<<<<< ");
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		System.out.println("---------------------------------------");
		

	}

}

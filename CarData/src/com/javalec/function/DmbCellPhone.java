package com.javalec.function;

public class DmbCellPhone extends CellPhone {
	
	public int channel;
	
	public DmbCellPhone(String model,String color,int channel) {
		super(model,color);	
		this.channel=channel;
	}
	
	public void turnOnDmb() {
		System.out.println("채널 "+channel+"번 DMB방송 수신을 시작 합니다.");
	}
	
	public void changeChannelDmb(int change) {	
		channel = change;
		System.out.println("채널 "+channel+"번 으로 변경합니다.");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB방송 수신을 멈춤니다.");
	}
}

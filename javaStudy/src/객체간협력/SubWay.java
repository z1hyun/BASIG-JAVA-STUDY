package 객체간협력;

public class SubWay {
	
	String lineNumber;
	int passengerCount;
	int money;
	
	
	public SubWay(String lineNumber) {
		this.lineNumber = lineNumber;
		/*지하철 노선 번호를 매개변수로 받는 생성자*/
	}
	
	public void take(int money) {
		this.money += money; //수입증가
		passengerCount++; //승객수 증가
	}
	
	public void showInfo() {
		System.out.println("지하철"+lineNumber+"번의 승객은"+passengerCount+"명이고, 수입은"+money+"입니다.");
	}
}

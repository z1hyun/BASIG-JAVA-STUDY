package 객체간협력;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		/*버스 번호를 매개변수로 받는 생성자*/
	}
	
	public void take(int money) {
		this.money += money; //버스 수입증가
		passengerCount++; //승객 수 증가
	}
	
	public void showInfo() {
		System.out.println("버스"+busNumber+"번의 승객은"+passengerCount+"명이고, 수입은"+money+"입니다.");
	}
}

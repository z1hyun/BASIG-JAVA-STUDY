package 객체간협력;

public class Taxi {


	int taxiNumber;
	int passengerCount;
	int money;
	
	
	public Taxi(int taxinumber) {
		this.taxiNumber = taxinumber;
	}
	
	public void takeTaxi(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("택시"+taxiNumber+"번의 승객은"+passengerCount+"명이고, 수입은"+money+"입니다.");
	}
}

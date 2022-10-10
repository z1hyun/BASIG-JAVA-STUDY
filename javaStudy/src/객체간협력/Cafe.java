package 객체간협력;

public class Cafe {

	String cafeName; //카페이름
	int cnt; //수량
	int total; //총매출
	
	
	
	public Cafe(String cafeName) {
		this.cafeName = cafeName;
	}
	
	
	public void buyAmericano(int money) {
		cnt ++;
		total += money;
	}
	
	public void buyLatte(int money) {
		cnt ++;
		total += money;
	}
	
	public void showInfo() {
		System.out.println(this.cafeName+"카페의 총 주문건수는"+cnt+"이고 총 매출은"+total);
	}
	
}

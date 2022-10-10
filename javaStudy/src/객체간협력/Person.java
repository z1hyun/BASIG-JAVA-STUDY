package 객체간협력;

public class Person {

	String name;
	int money;
	
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeAmericano(Cafe cafe) {
		cafe.buyAmericano(4000);
		this.money -= 4000;
	}
	public void takeLatte(Cafe cafe) {
		cafe.buyLatte(4500);
		this.money -= 4500;
	}
	
	public void showMoneyInfo() {
		System.out.println(this.name+"에게 남은돈은 "+this.money+"입니다.");
	}
}

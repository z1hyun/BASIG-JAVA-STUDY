package 객체간협력;

public class Order {

	public static void main(String[] args) {
		
		Person person1 =  new Person("최지현", 10000);
		Person person2 = new Person("구정모", 20000);
		
		Cafe ediya = new Cafe("이디야");
		person1.takeAmericano(ediya);
		person1.showMoneyInfo();
		ediya.showInfo();
		
		person2.takeLatte(ediya);
		person2.showMoneyInfo();
		ediya.showInfo();
	}
}

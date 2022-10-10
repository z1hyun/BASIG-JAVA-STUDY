package 생성자;

public class PersonTest {

	public static void main(String[] args) {
		
//		Person personLee = new Person("최지현", 161 ,51);
//							// Person() <- 생성자
//		
//		System.out.println(personLee.name);
//		System.out.println(personLee.height);
//		System.out.println(personLee.weight);
		
		/*
		 * Person()과 같은 함수를 생성자라고한다.
		 * 생성자가 하는 일은 클래스를 처음 만들때 멤버변수나 상수를 초기화하는것.
		 * 
		 */

		/*
		 * 디폴트 생성자가 없는데 디폴트 생성자를 구현하면 오류가 난다.
		 * 디폴트 생성자는 프로그래머가 생성자를 직접추가하면 디폴트 생성자는 안만들어짐.
		 * 그렇기때문에 매개변수가 있는 생성자를 호출하거나 프로그래머가 디폴트 생성자를 추가로 직접 구현하면 된다.
		 */
		
		
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		//위에 코드는 디폴트 생성자로 클래스를 생성한 후에 인스턴스 변수 값을 따로 초기화한다.
		
		Person personLee = new Person("이순신",175,75);
		//위 코드는 인스턴스 변수 초기화와 동시에 클래스를 생성
	
	
	}
}

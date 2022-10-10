package 생성자;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personLee = new Person();
							// Person() <- 생성자
		
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
	}
}

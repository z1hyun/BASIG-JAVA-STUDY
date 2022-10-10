package 생성자;

public class Person {
	
	String name;
	float height;
	float weight;
	
	/*
	 * 디폴트 생성자
	 * 생성자는 클래스를 생성할때만 호출한다.
	 * 생성자 이름은 클래스이름과 같고 반환값이 없습니다.
	 * 생성자가 없는 클래스는 클래스 파일을 컴파일할때 자바 컴파일러에서 자동으로 생성자를 만들어준다.
	 * 이렇게 자동으로 만들어주는 생성자를 디폴트 생성자라고 한다.
	 * 
	 * 디폴트 생성자 
	 * 매개변수가 없고 구현 코드가 없다.
	 * 프로그래머가 디폴트 생성자를 직접 만드는 경우에는 필요에 따라 직접 코드를 구현한다.
	 *
	 */
	public Person() {
		
	} //<- 이게 자바컴파일러가 자동으로 제공하는 디폴트 생성자

	/*생성자를 만들어보자*/

	public Person(String pname) {
		name =  pname;
		/*사람 이름을 매개변수로 입력받아서 Person 클래스를 생성하는 생성자*/
	}
	
	public Person(String pname, float pheight, float pweight) {  
		name = pname;
		height = pheight;
		weight = pweight;
		/*이름 , 키, 몸무게를 매개변수로 입력받는 생성자*/
	}
	

}

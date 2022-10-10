package Class정의;

public class Person {

	/*
	 * 문제
	 * 나이가 40살, 이름이 Jame라는 남자가 있습니다. 이 남자는 결혼을 했고, 자식이 셋 있습니다.
	 */
	
	int age;
	String name;
	boolean isMarried;
	int childrenCnt;
	
	
	public static void main(String[] args) {
		Person james  = new Person();
		james.age = 40;
		james.name = "james";
		james.isMarried = true;
		james.childrenCnt = 3;
		
		System.out.println("나이 :"+james.age);
		System.out.println("이름 :"+james.name);
		System.out.println("결혼여부 :"+james.isMarried);
		System.out.println("자녀수 :"+james.childrenCnt);
		
	}
}

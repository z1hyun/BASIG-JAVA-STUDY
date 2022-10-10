package Class정의;

public class StudentTest2 {
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentName = "최지현";
		
		Student student2 = new Student();
		student2.studentName = "구정모";
		
		System.out.println(student1); //참조변수값출력
		System.out.println(student2); //참조변수값출력
		
		/*
		 * 출력내용을 확인해보면 
		 * 클래스 이름@주소(해시코드) 값이나온다.
		 * 위 주소값은 JVM에서 객체가 생성되었을때 생성된 객체에 할당하는 가상주소값이다.
		 * student1 변수를 사용하여 student1 인스턴스를 참조할 수 있대.
		 * 이때 student1을 참조변수 , 주소값을 참조값이라한다.
		 */
		
	
		/*객체지향개념 용어
		 * 
		 * 객체 : 객체지향프고르매의 대상, 생성된 인스턴스
		 * 클래스 : 객체를 프로그래밍하기 위해 코드로 만든 상태
		 * 인스턴스 : 클래스가 메모리에 생성된 상태
		 * 멤버변수 : 클래스의 속성 , 특성
		 * 메소드 : 멤버 변수를 이용하여 클래스의 기능을 구현
		 * 참조변수 : 메모리에 생성된 인스턴스를 가르키는 변수
		 * 참조 값 : 생성된 인스턴스의 메모리 주소 값
		 */
		
	}
}

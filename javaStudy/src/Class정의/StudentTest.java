package Class정의;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentAhn = new Student(); // Student클래스 생성
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	
	/*
	 * 클래스 이름이 같아도 패키지가 다르면 다른 클래스입니다.
	 */
	
}

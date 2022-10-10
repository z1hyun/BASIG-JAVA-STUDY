package Class정의;

public class StudentClass {
	
	/*
	 * 아래 변수들은 StudentClass의 멤버변수
	 */
	int studentId;
	String studentName;
	int grade;
	String address; 
	
	/*
	 * 클래스 내부에서 멤버변수를 사용하여 클래스 기능을 구현한 것을
	 * 멤버함수 / 메소드 라고 한다.
	 */
	
	public void showStudentInfo() {
		System.out.println(studentName+","+address);
	}
}

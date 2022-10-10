package 생성자;

public class Student {

	int StudentId;
	
	public Student(int studentId) {
		this.StudentId = studentId;
		//학번을 매개변수로 입력받아 Student 클래스를 생성하는 생성자
	}
	
	/*
	 * 이러한 경우에는 학생이 생성될떄 꼭 학번이 필요하기때문에 디폴트생성자를 구현하지 않아도된다.
	 * 매개변수가 있는 생성자를 추가한다고해서 프로그래머가 꼭 디폴트 생성자를 추가로 작성해야하는 것은 아님.
	 */
}

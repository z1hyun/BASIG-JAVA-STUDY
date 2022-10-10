package 접근제어자;

public class Student {

	int studentId;
	private String studentName; // studentName 변수를 private으로 선언
	int grade;
	String address;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}

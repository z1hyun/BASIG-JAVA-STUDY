package 배열;

public class Student {

	int studentID;
	
	String name;
	
	
	public Student() {

	}
	
	public Student(int studentID , String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println("ID :"+studentID+" , 이름:"+name);
	}
}

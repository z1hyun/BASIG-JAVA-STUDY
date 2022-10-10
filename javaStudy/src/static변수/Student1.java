package static변수;

public class Student1 {

	public static int seriaNum = 1000;
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	
	public Student1() {
		seriaNum++;
		studentId = seriaNum;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}

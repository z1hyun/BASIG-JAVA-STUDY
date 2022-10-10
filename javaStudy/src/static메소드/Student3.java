package static메소드;

public class Student3 {

	int serialNum = 1000;
	int cardId ;
	String  studentName;
	
	
	public Student3() {
		serialNum += 100;
		cardId = serialNum;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
	
}

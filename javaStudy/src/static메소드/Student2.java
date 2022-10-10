package static메소드;

public class Student2 {
	
	/*
	 * 일반 멤버변수를 위한 메소드가 존재하듯
	 * static변수를 위한 메소드도 있다.
	 * 이런 메소드를 static메소드 혹은 클래스 메소드라고 한다.
	 * 
	 */
	
	private static int serialNum = 1000; //private 변수로 선언
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;
		return serialNum; //serialNum의 get()메소드
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
	
	
	
}

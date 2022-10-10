package static변수;

public class Student {
	
	public static int serialNum = 1000; // 인스턴스 상관없이 먼저 생성됨.
	public int studentId; 
	public String studentName;
	public int grade;
	public String address;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	/*
	 * static변수의 정의와 사용방법
	 *
	 * static변수 : 클래스에서 공통으로 사용하는 변수 / 다른 용어로 '정적변수'라고도 한다.
	 *
	 *  static 	   |  int  | serialNum;
	 *  static예약어 |  자료형 | 변수이름 
	 *
	 *static변수는 인스턴스가 생성될때마다 새로 생성되는 변수가 아니라
	 *프로그램이 실행되어 메모리에 올라갔을때 딱 한번 메모리 공간이 할당됩니다.
	 *
	 *static 변수는 인스턴스 생성과 상관없이 먼저 생성되고ㅓ
	 *그 값을 모든 인스턴스가 공유하게 되는것
	 *
	 *이런 이유때문에 static변수는 클래스에 기반한 변수라고 해서 클래스변수(class variable)이라고도 한다.
	 */
	
	

	
}

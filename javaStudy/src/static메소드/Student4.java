package static메소드;

public class Student4 {

	public static void main(String[] args) {
		
		Student2 studentLee =  new Student2();
		studentLee.setStudentName("이지원");
		
		System.out.println(Student2.getSerialNum());
		//serialNum 값을 가져오기 위해 get()메소드를 클래스 이름으로 직접호출
		System.out.println(studentLee.studentName+" 학번: "+studentLee.studentID);
	
	
		Student2 studentSon =  new Student2();
		studentSon.setStudentName("손수경");
		
		System.out.println(Student2.getSerialNum());
		//serialNum 값을 가져오기 위해 get()메소드를 클래스 이름으로 직접호출
		System.out.println(studentSon.studentName+" 학번: "+studentSon.studentID);
		
		/*
		 * serialNum을 직접참조하지 않고 getSerialNum()메소드를 호출하여 참조한다.
		 * static메소드 또한 static변수처럼 인스턴스를 참조하지않고 바로 호출할수있다.
		 */
	}
}

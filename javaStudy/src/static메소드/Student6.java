package static메소드;

public class Student6 {

	public static void main(String[] args) {
		
		Student3 studentJihyun =  new Student3();
		
		studentJihyun.setStudentName("최지현");
		System.out.println(studentJihyun.cardId);
		
		Student3 studentJungmo = new Student3();
		studentJungmo.setStudentName("구정모");
		System.out.println(studentJungmo.cardId);
	}
}

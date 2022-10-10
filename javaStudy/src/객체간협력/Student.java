package 객체간협력;

public class Student {

	public String studentName ; 
	public int grade;
	public int money;

	public Student(String studentNmae, int money) {
		this.studentName = studentNmae;
		this.money = money;
		
		/*학생 이름과 가진 돈을 매개변수로 받는 생성자*/
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
		/*학생이 버스를 타면 1,000원을 지불하는 기능을 구현한 메소드*/
	}
	
	public void takeSubway(SubWay subway) {
		subway.take(1500);
		this.money -= 1500;
		/*학생이 지하철을 타면 1,500원을 지불하는 기능을 구현한 메소드*/
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.takeTaxi(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은"+money+"입니다.");
	}
	
}

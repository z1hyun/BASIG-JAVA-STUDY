package 객체간협력;

public class TakeTrans {
	
	public static void main(String[] args) {
		
		Student stdentJihyun = new Student("최지현", 5000);
		Student studentJungmo = new Student("구정모", 10000);
		
		
//		Bus bus100 = new Bus(100); //노선번호 100번인 버스생성
//		stdentJihyun.takeBus(bus100); //최지현은 100번버스를 탔다.
//		stdentJihyun.showInfo();// 최지현 정보 출력
//		bus100.showInfo(); //버스정보 출력
//		
//		studentJungmo.takeBus(bus100);
//		studentJungmo.showInfo();
//		bus100.showInfo();
//		
//		studentJungmo.takeBus(bus100);
//		studentJungmo.showInfo();
//		bus100.showInfo();
//		
//		SubWay subWayGreen = new SubWay("2호선");
//		studentJungmo.takeSubway(subWayGreen);
//		studentJungmo.showInfo();
//		subWayGreen.showInfo();
		
		Taxi taxi1111= new Taxi(1111);
		studentJungmo.takeTaxi(taxi1111);
		studentJungmo.showInfo();
		taxi1111.showInfo();
	}
}

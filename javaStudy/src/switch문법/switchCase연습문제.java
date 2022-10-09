package switch문법;

public class switchCase연습문제 {
	
	/* ---문제--- 
	 * 5층 건물이 있습니다.
	 * 1층 약국, 2층 정형외과 , 3층 피부과 , 4층 치과 , 5층 헬스클럽입니다.
	 * 건물의 층을 누르면 그 층이 어떤 곳인지 알려 주는 엘레베이터가 있다고 할 때의 예제를 참고해서
	 * switch-case문을 구현해보세요
	 * (5인 경우 '5층 헬스클럽입니다'라고 출력)
	 *
	 */
	public static void main(String[] args) {
		
		int floor = 3;
		String place = "" ; 
		
		switch(floor) {
		
		case 1 : place = "약국";
			break;
		case 2 : place = "정형외과";
			break;
		case 3 : place = "피부과";
			break;
		case 4 : place = "치과";
			break;
		case 5 : place = "헬스클럽";
			break;
		default : place = "없음";
		}
		System.out.println(floor+"층은 "+place+"입니다.");
	}
}

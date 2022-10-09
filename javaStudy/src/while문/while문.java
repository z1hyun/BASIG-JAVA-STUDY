package while문;

public class while문 {

	/*
	 * while문은 조건식이 참인 경우에만 수행문1을 실행하면서 계속 돌고
	 * 거짓인 경우 수행문2을 실행하면서 빠져나간다.
	 */
	
	/*
	 * 1부터 10까지 숫자가 커지는 동안 1씩 증가된 숫자를 모두 더하는 문제를 풀어보자!
	 * ex ) 1 + 2 + 3 + 4 .......+ 10
	 */
	public static void main(String[] args) {
		
		int num = 0 ;
		int sum = 0;
		
		while(num <= 10) {
			sum += num; 
			num++;
			System.out.println("sum :"+sum);
			System.out.println("num :"+num);
		/*
		 * 출력문을 찍어보면서 확인하면 이해가 쉽다.
		 */
		}
		System.out.println("1부터 10까지의 합은"+sum+"입니다.");
		/*
		 * num이 10이 될때까지만 진행한다. 11이되면 반복문은 종료된다.
		 * 
		 * - 변수를 항상 초기화해야하는건 아니지만 위와 같은 식은 미리 초기화해야한다고 한다.
		 * 이유는 sum에 num을 더한값을 sum에 담아주는데 num의 값이 정해져있지않으면
		 * 어떤 값을 더해야할지 모르기때문에 컴파일 오류가난다.
		 */
	}
}

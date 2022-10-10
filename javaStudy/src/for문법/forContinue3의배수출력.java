package for문법;

public class forContinue3의배수출력 {
	
	/*
	 * 1부터 100까지 수 중에서 3의 배수만 출력하는 코드를 완성해보세요.
	 */
	public static void main(String[] args) {
		int num;
		
		for(num=1 ; num <=100; num++) {
			if(num %3 !=0) //3으로 나눴을때 0이 아닌 수 
				continue; // 0인경우 생략하고 증감식실행.
			System.out.println(num); //1인경우 출력
		}
	}
}

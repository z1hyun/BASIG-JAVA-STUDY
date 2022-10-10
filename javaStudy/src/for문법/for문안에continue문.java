package for문법;

public class for문안에continue문 {

	public static void main(String[] args) {
		
		int total = 0;
		int num;
		
		/*
		 * continue문은 반복문안에서 만나면
		 * 이후의 문장은 실행하지 않고 for문의 처음으로 돌아가 증감식을 수행한다.
		 */
		
		for(num = 1; num<=100; num++) { // 100까지 반복한다.
			if(num % 2 == 0) //num값이 짝수인 경우
				continue; //continue 이후문을 생략하고 증감식을 다시 실행한다.
			total += num; //num값이 홀수인 경우에만 수행한다.
		}
		
		System.out.println("1부터 100까지의 홀수의 합은:"+total+"입니다.");
	}
}

package for문법;

public class for문문제 {

	/* 문제
	 * 1부터 더했을때 그 합이 500이 넘는 자연수는 얼마인가요?
	 */
	public static void main(String[] args) {
	
		int sum = 0;
		int num;
		
		for(num = 1; ; num++) {
			sum += num;
			if(sum >= 500)
				break;
		}
		System.out.println(sum);
		System.out.println(num);
	}
}

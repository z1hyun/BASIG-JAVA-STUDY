package for문법;

public class for문 {

	public static void main(String[] args) {
		
	int i; //초기화
	int sum;
	
	for(i=1, sum = 0; i<=10; i++) {
		sum += i;
	}
	
	System.out.println("1부터 10까지의 합은"+sum+"입니다.");
	}
	
	/*
	 * for문은 이렇게도 사용할 수 있습니다.
	 */
	
	/* ====초기화식 생략
	 * 다른 곳에서 변수가 초기화되어 중복으로 초기화 할 필요가 없을때 초기화부분을 생략할 수 있다.
	 * for(; i<5; i++)
	 */
	
	/* ====조건식 생략
	 * 어떤 연산 결과 값이 나왔을때 바로 for문의 수행을 멈추려면 조건식을 생략하고 for문 안에 if문을 사용하면 됩니다.
	 * 예를 들어 1부터 시작해 수를 더해 나갈 때 더한 결과 값이 200을 넘는지 검사하려면 for문 안에 if문을 사용한다.
	 *
	 * for(i =0; ; i++){
	 * 	sum += i;
	 * 	if(sum > 200) break;
	 *	}
	 */
	
	/* ====증감식 생략
	 * 증감식의 연산이 복잡하거나 다른 변수의 연산 결과 값에 좌우된다면 증감식을 생략하고 for문안에 쓸 수 있다.
	 *
	 * for(i=0; i<5; ){
	 * 	...
	 * 	i = (++i) % 10;
	 *}
	 */
	
	/* ====요소 모두 생략
	 * 모든 요소를 생략하고 무한 반복하는 경우에 사용합니다. 
	 *for(; ;)
	 */
}

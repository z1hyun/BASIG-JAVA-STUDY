package while문;

public class doWhile문 {
	
	public static void main(String[] args) {
		/*
		 * while문은 조건을 먼저 검사하기 때문에 조건에 맞지않으면 반복수행문이 일어나지않는다.
		 * 하지만 do-while문은 {}안의 문장을 먼저 수행한후 조건식을 검사한다.
		 * 중괄호안에 문장을 반드시 한번 이상 수행해야할 때 while문대신 do-while문을 사용한다.
		 * 
		 */
		
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num ++;
		}while(num <= 10);
			System.out.println("1부터 10까지의 합은"+sum+"입니다.");
		}
	/*
	 * 처음에 sum에 sum+num한 값이 들어갔는데 num이 계속 10이하 이기때문에 위 sum의 값은 55가 나온다.
	 * 하지만 num을 12로 값을 넣고 실행하면
	 * 초반에 sum은 sum(0)+num(12)한 값이 들어가서 12가되고
	 * while문을 수행문을 실행하지 않기때문에 최종적 sum은 12로 출력된다. 
	 */
	}


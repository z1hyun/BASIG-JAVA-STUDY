package for문법;

public class for문안에break문 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
//		for(num=0; sum<100; num++) { //합한 값이 100보다 클 때 종료
//			sum += num;
//		}
//		
//		System.out.println("num : "+num); //15 
//		System.out.println("sum : "+sum); //105
//		
		
		//위에 코드를 조건식을 생략하는 대신 break문을 사용하여 출력해보자.
		
		for(num = 0; ; num++) {
			sum += num;
			if(sum >= 100) //sum이 100보다 크거나 같으면 반복문을 바로 빠져나온다.
				break;
		}
		System.out.println("num : "+num); //14 
		System.out.println("sum : "+sum); // 105
		
		/*
		 * 위에 코드랑 num값이 다른 이유 : 종료조건을 for문 안에 사용하면 
		 * num값을 늘리는 증감식을 먼저 수행하므로 num값이 15가 된다.
		 * 프로그램 실행 중에 반복문을 중다낳려면 break문을 사용해야 정확한 결과값을 얻을수 있다함.
		 */
		
		/*
		 * 중첩 반복문에서 내부반복문에 break를 걸면 내부반복문에서만 빠져나오고
		 * 외부 반복문은 빠져나오지 않는다.
		 *
		 *
		 * ex) while(조건식1){
		 * 		  while(조건식2){ //조건에 해당하는 경우
		 * 		 	break;//내부 반복문만 빠져나옴
		 * 		 }
		 * 	   }
		 */
	}
}

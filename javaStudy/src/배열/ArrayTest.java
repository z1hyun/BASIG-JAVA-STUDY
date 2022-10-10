package 배열;

public class ArrayTest {

	public static void main(String[] args) {
		/*
		 * 배열길이가 n이라한다면 
		 * 배열순서는 0번부터 n-1번까지다.
		 */
		int[] num = {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		for(int i =0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		for(int i =0; i<num.length; i++) {
			sum += num[i];
		}
		System.out.println(sum);
	}
}

package 배열응용프로그램;

public class 배열문제 {

	public static void main(String[] args) {
		int[] array1 = new int[5];
		int sum = 0;
		
		for(int i = 0 ; i<array1.length; i++) {
			for (int j = 1; j <= 10; j++) {
				if (j % 2 == 1) {
					continue;
				}
				array1[i] = i;
				sum += array1[i];
			}
			System.out.println(array1[i]);
			System.out.println(sum);
		}
		

	}

}

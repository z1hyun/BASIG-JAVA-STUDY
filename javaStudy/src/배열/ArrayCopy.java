package 배열;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		
		System.arraycopy(array1, 0, array2, 1, 4);
					 // 복사할배열, 복사할 첫위치, 대상배열 , 붙여넣을 첫위치 , 복사할 요소 개수
		for(int i = 0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		/*
		 * 복사시에 복사할 대상 배열의 전체길이가 복사할 요소 개수보다 작으면 오류가난다.
		 * 위에선 요소 4개를 복사했지만 만약에 요소 5개를 복사하면
		 * array2배열 길이보다 요소 개수가 많아지므로 오류가 발생.
		 */
	}
}

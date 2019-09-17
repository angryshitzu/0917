package Java0917;

import java.util.Arrays;

public class ArraysMain1 {

	public static void main(String[] args) {
		String [] names = {"John","Paul","George","Ringo"};
		//배열의 데이터를 정렬해주는 메소드
		//Arrays.sort -String 클래스는 Comparable을 implements	했으므로 정렬 가능
		Arrays.sort(names);
		//정렬 되었는지 확인
		for(String name : names) {
			System.out.printf("%s\n",name);
		}
		
		//정수 배열도 정렬이 가능
		//정수는 int지만 Arrays가 볼 때는 Integer이다.
		int [] ar = {300,200,54,13,879,34,198,566};
		//정렬하지 않은 상태에서 binary search 수행
		//binary search는 정렬이 되지 않은상태에서 수행하면올바른 결과를가져오지 못한다.
		int result = Arrays.binarySearch(ar, 34);
		
			System.out.printf("result : %s\n",result);
		
		//먼저 정렬을 수행하고
			Arrays.sort(ar);
			result = Arrays.binarySearch(ar, 200);
			System.out.printf("result : %s\n",result);
		
	}

}

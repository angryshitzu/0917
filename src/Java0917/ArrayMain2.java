package Java0917;

import java.util.Arrays;

public class ArrayMain2 {

	public static void main(String[] args) {
		// FileName의 배열을 생성
		Filename f1 = new Filename();
		f1.setName("웅이");
		f1.setSize(100);
		f1.setType("고양이");
		
		Filename f2 = new Filename();
		f2.setName("헐크");
		f2.setSize(60);
		f2.setType("강아지");
		
		Filename f3 = new Filename();
		f3.setName("똘이");
		f3.setSize(10);
		f3.setType("햄스");
		
		//위에서 만든 Filename 객체 3개를 가지고 배열을 생성
		Filename [] ar = {f1,f2,f3};
		
		//배열의 데이터를 확인
		for(Filename temp : ar) {
			//객체 이름을 %s에 매핑 시켜서 출력하면 toString()의 결과가 출력
			System.out.printf("%s\n", temp);
		}
		
		//배열의 데이터 정렬
		//데이터를 정렬하려면 크기 비교하는 메소드가 구현되어 있어야 한다.
		//Comparable 인터페이스의 CompareTo 메소드
		//아니면 Comparable 인터페이스를 구현한 객체를 대입을 해 주어야 한다.
		
		Arrays.sort(ar);
		System.out.printf("============================\n");
		
		for(Filename temp : ar) {
			//객체 이름을 %s에 매핑 시켜서 출력하면 toString()의 결과가 출력
			System.out.printf("%s\n", temp);
		}
		
	}
}

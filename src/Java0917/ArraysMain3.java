package Java0917;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraysMain3 {

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
		
		//키보드로부터 입력받기 위한 객체 생성
		Scanner sc =new Scanner(System.in);
		
		System.out.printf("정렬기준을 선택하세요(1. 이름 2.크기):");
		int menu = sc.nextInt();
		
		//Comparator는 제너릭이 적용된 인터페이스라서 객체를 생성할 때 자료형을 결정해주어야 한다.
		
		if(menu ==1) {
			Arrays.sort(ar, new Comparator<Filename>() {
			
				@Override
				public int compare(Filename o1, Filename o2) {
					//o1과 o2를 비교
						return o1.getName().compareTo(o2.getName());
				}
			});
			
		}else if(menu ==2) {
			Arrays.sort(ar, new Comparator<Filename>() {
				
				@Override
				public int compare(Filename o1, Filename o2) {
					//o1과 o2를 비교
						return o1.getSize()-o2.getSize();
				}
			});
			
		}else {
			System.out.printf("메뉴는 1번과 2번만 선택하세요!!!\n");
			//시스템 종료
			System.exit(0);
		}
		
		//ar 배용의 내용을 출력
		for(Filename temp : ar) {
			System.out.printf("%s\n", temp);
		}
		
		//입력받는 객체 닫기
		sc.close();
	}

}

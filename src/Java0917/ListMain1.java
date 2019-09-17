package Java0917;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain1 {

	public static void main(String[] args) {
		// 문자열을 저장하는 ArrayList생성
		List<String> al = new ArrayList<>();
		// 문자열을 저장하는 LikedList생성
		List<String> li = new LinkedList<>();
		
		al.add("John");
		li.add("John");
		
		al.add("Paul");
		li.add("Paul");
		
		long start = System.currentTimeMillis();
		for(int i = 0; i<100000; i = i+1) {
			li.add(1,"George");
		}
		long end = System.currentTimeMillis();
		System.out.printf("LinkedList 작업시간:%d\n", (end-start));
		
		start = System.currentTimeMillis();
		for(int i = 0; i<100000; i = i+1) {
			al.add(1,"George");
		}
		end = System.currentTimeMillis();
		System.out.printf("ArrayList 작업시간:%d\n", (end-start));	
		//array와 list 시간 비교
		
		
		//array와 list 시간 비교 2
		start = System.currentTimeMillis();
		int size = al.size();
		for(int i =0;i<size; i = i+1) {
			String data = li.get(i); //li. 과 al.을 바꿔 넣어서 비교해보자! 호잇!
			System.out.printf("%s\n", data);
		}
		
		end = System.currentTimeMillis();
				System.out.printf("ArrayList 작업시간:%d\n", (end-start));		
				
				
		
		
	}

}

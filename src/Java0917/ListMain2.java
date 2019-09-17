package Java0917;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListMain2 {

	public static void main(String[] args) {
		// 테이블 구조 만들기
		List<Person> list = new ArrayList();
		//테이블에 삽입할 데이터를 생성
		Person person = new Person();
		person.setName("John");
		person.setPhone("01045671234");
		person.setAddress("Liverpool");
		person.setAge(33);

		//테이블에 데이터를 삽입하기
		list.add(person);
		
		person = new Person();
		person.setName("Paul");
		person.setPhone("01043171234");
		person.setAddress("London");
		person.setAge(32);

		//테이블에 데이터를 삽입하기
		list.add(person);
		
		//데이터를 정렬(sort)
		list.sort(new Comparator<Person>() {

			//나이로 정렬
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getAddress().compareTo(o2.getAddress());
			}
			
		});
		
		//타이틀을 출력
		System.out.printf("%-10s%-15s%-20s%-5s\n", "이름","전화번호","주소","나이");
		//Fast Enumeration 이용한 List 접근
		for(Person p : list) {
			System.out.printf(
					"%-10s%-15s%-20s%-5d\n",
					p.getName(),p.getPhone(),p.getAddress(),p.getAge());
			
		}
	}

}

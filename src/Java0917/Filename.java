package Java0917;


//여러개의 데이터를 묶어주기 위한 클래스 - DTO(V)) 클래스
//Comparable 인터페이스를 구현
public class Filename implements Comparable {
	//속성(변수)은 private
	private String name;
	private int size;
	private String type;
	
	//변수에 접근하기 위한 접근자 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//디버깅을 위한 메소드
	//각 속성의 값을 빠르게 확인하기 위한 메소드
	@Override
	public String toString() {
		return "Filename [name=" + name + ", size=" + size + ", type=" + type + "]";
	}
	@Override
	//자신이 크면 양수 같으면 0 매개변수가 크면 음수를 리턴
	//Object 클래스의 객체는 사용할 때 원래의 자료형으로 형 변환해서 사용
	public int compareTo(Object o) {
	
	//숫자 데이터는 뺄셈을 이용해서 크기 비교 가능
	/*
		Filename other = (Filename)o;
		return other.size - this.size ;
	*/
		
		Filename other = (Filename)o;
		//문자열은 뺄셈을 이용할 수 없다
		//return this.name.compareTo(other.name); 
		return other.name.compareTo(this.name); 
	}
	
	
	
}

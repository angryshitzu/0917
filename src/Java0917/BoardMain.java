package Java0917;

import java.util.LinkedList;
import java.util.List;

public class BoardMain {

	public static void main(String[] args) {
		// Board 클래스의 객체 여러개를 저장할 수 있는 자료 구조를 생성
		//배열(크기 변경이 안됨),ArrayList(읽기는 빠름),LinkedList(삽입 삭제가 빠름)
			List<Board> list = new LinkedList<>();
			//Board Class를 객체를 만들어서 데이터를 설정한 후 list에 삽입
			//이 부분은 데이터베이스에서 읽어오던가 파일에서 읽어오는 형태로 변경
			Board board = new Board();
			board.setNum(1);
			board.setTitle("yes!");
			board.setUser("John");
			board.setDate("2019-09-17");

			//테이블에 데이터를 삽입하기
			list.add(board);
				

	}

}

package Java0917;

public class Board {
	//각각의 속성을 프라이빗 변수로 생성
	private int num;
	private String title ;
	private String user;
	private String date;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Board [num=" + num + ", title=" + title + ", user=" + user + ", date=" + date + "]";
	}
	
	
	

}
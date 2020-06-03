package lecture10;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("문자열 객체");
		} catch (ClassNotFoundException e) { // ()안에 Exception이 들어가면 모든 에러를 잡는다. 최상위 예외클래스.
			e.printStackTrace(); // 에러 출력기능. 지워놓으면 에러가 뜨지 않는다.
			System.out.println("클래스가 존재하지 않습니다."); // try에 에러가 있다면 출력. 없다면 출력X
		} finally { //무조건 실행!
			System.out.println("프로그램 종료");
		}
	}

}

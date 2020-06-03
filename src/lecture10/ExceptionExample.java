package lecture10;

public class ExceptionExample {

	public static void main(String[] args) {
		try {								 //Surround
			Class.forName("java.lang.String");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
/*
public class ExceptionExample {
public static void main(String[] args) throws ClassNotFoundException 예외 떠넘기기
Class.forName("java.la\ng.String");
}
*/
package restudy;

public class rememory209 {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue; //char을 캐스팅 해서 유니코드 값으로 나올 수 있도록 한다.
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);

	}

}

package lecture06;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println("K1.name : " + k1.name);
		System.out.println("K1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("김자바", "930525-0654321");
		System.out.println("K2.name : " + k2.name);
		System.out.println("K2.ssn : " + k2.ssn);
	}

}

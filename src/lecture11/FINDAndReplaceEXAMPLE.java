package lecture11;

public class FINDAndReplaceEXAMPLE {
	public static void main(String[] args) {
		String str = "모든 프로그램은 자바";
	int index = str.indexOf("자바");
	if(index == -1) {
		System.out.println("자바 문자열 o");
	} else {
		System.out.println("자바 문자열x");
		str = str.replace("자바", "java");
	}
	System.out.println(str);
	}
}

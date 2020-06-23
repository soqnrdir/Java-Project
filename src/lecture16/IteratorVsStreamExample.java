package lecture16;

import java.util.Arrays;
import java.util.List;

public class IteratorVsStreamExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "신용권", "이태영", "최승주", "서나리", "임이랑", "배동환", "소리엘", "임구현");
		list.stream().filter(t -> t.contains("이")).map(t -> t + "★").forEach(System.out::println);
		long count = list.stream().filter(t -> t.contains("이")).count();
		System.out.println(count + "명"); 
	
		
	}

}

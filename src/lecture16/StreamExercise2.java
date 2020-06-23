package lecture16;

import java.util.Arrays;
import java.util.List;


public class StreamExercise2 {
	public static void main(String[] args) {
		String names = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		List<String> nameList = Arrays.asList(names.split(","));
	
		long countOfKim = nameList.stream().filter(t -> t.startsWith("김")).count();
		long countOfLee = nameList.stream().filter(t -> t.startsWith("이")).count();
		long countOfLeeJaeYeong = nameList.stream().filter(t -> t.equals("이재영")).count();
		String nameSet = nameList.stream().distinct().reduce((t, u) -> t + ", " + u).get();
		String sortedName = nameList.stream().distinct().sorted().reduce((t, u) -> t + ", " + u).get();
		System.out.println("김씨: " + countOfKim + "명, 이씨: " + countOfLee + "명");
		System.out.println("이재영이 반복된 횟수: " + countOfLeeJaeYeong + "번");
		System.out.println(nameSet);
		System.out.println(sortedName);
	}

}

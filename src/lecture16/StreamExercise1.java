package lecture16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class StreamExercise1 {
	public static void main(String[] args) {
	String names = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
	List<String> nameList = Arrays.asList(names.split(","));
	int countOfKim = 0;
	int countOfLee = 0;
	int countOfLeeJaeYeong = 0;
	ArrayList<String> nameSet = new ArrayList<String>();
	for (String name : nameList) {
		if(name.startsWith("김")) {
			countOfKim++;
		}
		if(name.startsWith("이")) {
			countOfLee++;
		}
		if(name.equals("이재영")) {
			countOfLeeJaeYeong++;
		}
		// 중복 제거
		if(!nameSet.contains(name)) { //중복을 포함하는 지를 확인
			nameSet.add(name); //중복이 아닌것을 대입 
		}
	}
	System.out.println("김씨: " + countOfKim + "명, 이씨: " + countOfLee + "명");
	System.out.println("이재영이 반복된 횟수: " + countOfLeeJaeYeong + "번");
	System.out.println(nameSet);
	Collections.sort(nameSet);
	System.out.println(nameSet);
	
	//System.out.println(new HashSet<String>(nameList)); //바로 중복제거되서 출력

	}

}

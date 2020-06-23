package lecture16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class StreamExercise {

	public static void main(String[] args) {
		String names = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		String[] nameArray = null;
		nameArray = names.split(",");
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		ArrayList<String> array = new ArrayList<String>();

		for (int i = 0; i < nameArray.length; i++) {
			array.add(nameArray[i]);
		}
		HashSet<String> array2 = new HashSet<String>(array);
		ArrayList<String> array3 = new ArrayList<String>(array2);

		for (int i = 0; i < nameArray.length; i++) {
			if(nameArray[i].startsWith("김")) {
				count1++;
			} else if (nameArray[i].startsWith("이")) {
				count2++;
			}
		}
		for (int j = 0; j < nameArray.length; j++) {
			if(nameArray[j].equals("이재영")) {
				count3++;
			}
		}
		System.out.println("1. 김씨와 이씨는 각각 몇명인가요? " + count1 + "명, " + count2 + "명");
		System.out.println("2. '이재영'이란 이름이 몇 번 반복되나요? " + count2 +"번");
		System.out.println("3. 중복을 제거한 이름을 출력하세요.");
		System.out.println(array3);
		Collections.sort(array3); //오름차순 정렬
		System.out.println("4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.");
		System.out.println(array3);
	}
}


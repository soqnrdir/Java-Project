package lecture15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a001","값1");
		map.put("a001","값5"); //키가 중복 중복된 키는 마지막에 입력된 값으로 출력된다.
		map.put("a002","값2");
		map.put("a003","값3");
		map.put("a004","값4");
		
		System.out.println(map.get("a001"));//해당하는 키의 값을 리턴
		System.out.println();
		System.out.println("entryset을 이용하는 방법");
		//1. 반복자 사용
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println(entry.getValue());
			
		}
		System.out.println();
		System.out.println("entryset을 이용하는 방법 - foreach");
		//2, foreach문
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}
		System.out.println();
		System.out.println("keyset을 이용하는 방법");
		Iterator<String> keyIterator = map.keySet().iterator();
		while (keyIterator.hasNext()) {
			String string = keyIterator.next();
			System.out.println(map.get(string));
			
		}
		

}
}
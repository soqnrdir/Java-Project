package lecture15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<Phone> list = new ArrayList<Phone>(); // List에 들어갈 데이터의 종류가 Phone이라는 타입.
		list.add(new Phone("velvet", 64, "LG")); // 값을 포장해서 list에 add.
		list.add(new Phone("Galaxy", 128, "Samsung"));
		list.add(new Phone("IPhone", 256, "Apple"));
		// for (Phone phone : list) {
		// System.out.println(phone);
		// }

		list.add(1, new Phone("사이언", 16, "LG")); // 원하는 위치에 삽입, 원래값은 뒤로 밀려남.
		Phone velvetPhone = list.get(0); //해당 인덱스에 있는 값 가져오기.
		System.out.println(velvetPhone);
		
		list.remove(2); //2번이였던 Galaxy 가 모델인 값이 제거된다.
		System.out.println("전체 크기: " + list.size()); //그 값의 개수.
		
		for (Phone phone : list) {
			System.out.println(phone);
		}
		list.clear(); //지우기.
		System.out.println("전체 크기: " + list.size()); //그 값의 개수.
		
	}
}

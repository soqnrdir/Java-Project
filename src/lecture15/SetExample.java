package lecture15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<Phone> set = new HashSet<>();
		set.add(new Phone("velvet", 64, "LG")); 
		set.add(new Phone("velvet", 64, "LG"));
		set.add(new Phone("velvet", 128, "LG")); //용량이 달라도 중복되는 사항이 있으므로 배제해준다.
		set.add(new Phone("Galaxy", 128, "Samsung"));
		set.add(new Phone("Galaxy", 128, "Samsung"));
		set.add(new Phone("IPhone", 256, "Apple"));
		set.add(new Phone("IPhone", 256, "Apple"));
		System.out.println("전체 갯수: " + set.size()); //객체들의 주소가 다르기에 중복가능. 이를 Phone쿨래스에서 해쉬코드와 equal로 비교.
		System.out.println();
		System.out.println("1.반복자(Iterator)를 이용");
		Iterator<Phone> iterator = set.iterator(); //인터페이스, 반복좌
		while (iterator.hasNext()) {
			Phone phone = iterator.next(); //위에서 제네릭으로 이미 Phone을 선언했기에 캐스팅으로 불러오지 않아도 된다.
			System.out.println(phone);
		}
		System.out.println();
		System.out.println("2.항상된 for문(forecah문)");
		for (Phone phone : set) {
			System.out.println(phone);
		}
	}


}

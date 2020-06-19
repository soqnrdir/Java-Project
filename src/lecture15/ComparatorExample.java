package lecture15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		Set<Fruit> set = new TreeSet<Fruit>(new Comparator<Fruit>() {

			@Override
			public int compare(Fruit o1, Fruit o2) { // o1 과 o2를 비교
				//return o2.getName().compareTo(o1.getName()): 문자열로 정렬
				if (o1.getPrice() < o2.getPrice()) {
					return 1; //1이면 내림차순 -1이면 오름차순으로 정렬
				} else if (o1.getPrice() == o2.getPrice()) {
					return 0;
				} else {
					return -1;
				}

			}
		});
		set.add(new Fruit("포도", 1000));
		set.add(new Fruit("수박", 4000));
		set.add(new Fruit("딸기", 6000));
		Iterator<Fruit> iterator = set.iterator();
		while (iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit);
			
		}
		
	}

}

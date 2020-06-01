package exam8;

public class PersonTest {
	public static void main(String[] args) {
		Person[] peoples = new Person[10];
		peoples[0] = new Person("김민규", 170.0);
		peoples[1] = new Person("이정희", 156.3);
		peoples[2] = new Person("홍인규", 193.2);
		peoples[3] = new Person("최인석", 177.3);
		peoples[4] = new Person("문보람", 171.4);
		peoples[5] = new Person("김희웅", 172.3);
		peoples[6] = new Person("장호웅", 182.9);
		peoples[7] = new Person("이석휘", 176.1);
		peoples[8] = new Person("김준용", 184.8);
		peoples[9] = new Person("신일구", 188.3);
		System.out.println("<배열에 저장된 사람들>");
		for (Person p : peoples) {
			System.out.println(p);
		}
		System.out.println("가장 키가 큰 사람: " + Person.getTallest(peoples));
	}

}

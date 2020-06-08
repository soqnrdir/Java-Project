package lecture13;

public class GenericExample {
	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		box.setObject(100);
		int num = box.getObject();
		
		box.setObject(314);
		int value = box.getObject(); //int 밖에 못들어오니 컴파일 체크를 해준다.
		
		Boxes<String> boxes = new Boxes<>(5); //문자열만 가능 Boolean Integer 등도 기입가능/타입추론으로 뒤에는 생략가능
		boxes.addObject("홍길동");
	/*	boxes.addObject(100);
		boxes.addObject(3.14);
		boxes.addObject(true);
		boxes.addObject(new Box()); */
		for (Object obj : boxes.getObjects()) {
			if (obj instanceof String) {
				String name1 = obj + "님";	
			}
		}
	}
}

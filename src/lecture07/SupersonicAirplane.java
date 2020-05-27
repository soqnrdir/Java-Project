package lecture07;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음비행합니다."); //오버라이드를 통해 재정의
		} else {
			// Airplane 객체의 fly() 메소드 호출
			super.fly();
		}

	}
}

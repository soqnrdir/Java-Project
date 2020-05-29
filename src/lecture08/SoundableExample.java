package lecture08;

public class SoundableExample {

	public static void printSound(Soundable soundable) { //하위객체가 들어갈 수 있다.
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) { //하위객체들
		printSound(new Cat());
		printSound(new Dog());
		printSound(new Cow());
		printSound(new Duck());
		//Cat cat = new Cat -> 상위 객체가 타입이 될 수 있다. 
	}
		
}

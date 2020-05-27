package lecture07;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();  //자동타입변환
		animal.sound();		 //재정의된 메소드 호출
		animal = new Cat();  //자동타입변환
		animal.sound();      //재정의된 메소드 호출
		System.out.println("-----");

		
		//메소드의 다형성
		animalSound(new Dog()); //상속받은 객체들.
		animalSound(new Cat());
	}

	public static void animalSound( Animal animal ) { //animal = Dog() ,Cat()
		animal.sound(); //재정의된 메소드 호출
	}
}

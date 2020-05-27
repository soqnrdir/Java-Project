package lecture07;

public class Dog extends Animal { //Animal은 추상 클래스이므로 반드시 구현해줘야할 메소드가 필요함.
	public Dog() {
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("멍멍");
		
	} 
	
}
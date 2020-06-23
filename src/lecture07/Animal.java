package lecture07;
	//추상 클래스
public abstract class Animal {
	//필드
    String kind;
	
	public void breathe() {  
		System.out.println("숨을 쉽니다.");
	}
	//추상 메소드
	public abstract void sound(); //abstract는 {}가 필요없다.(구현체)
}


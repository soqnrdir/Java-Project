package lecture07;

public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel) {
		//super(); 부모클래스 호출 ,생략가능하며 생략됐다는것은 이미 호출중이라는 것.
		this.model = model;	//super.model도 가능하다.
		this.color = color; //model, color는 부모클래스인 CellPhone에서 가져옴.
		this.channel = channel;
	}

	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) { //int 값을 입력해 채널번호를 나타냄.
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}


package lecture06;

public class NextCar {
	//속도
    private int speed; //필드
	//자동차의 상태
	private boolean stop; //(멈췄나, 달리나) true/false 로 판단.
	//겟터
	NextCar(int speed , boolean stop) {
		this.speed = speed;
		this.stop = stop;
	}
	
	public int getSpeed() {
		return this.speed;  //private 를 걸어줬기때문에 권한을 설정해준다.
	}
	//세터
	public void setSpeed(int speed) {
		this.speed =speed;
	}
	public boolean isStop() {
		return this.stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}

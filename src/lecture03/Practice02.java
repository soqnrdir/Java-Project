package lecture03;

public class Practice02 {

	public static void main(String[] args) {
		double distance = 40e12;
		double light = 30e4;
		double time;
		time = distance/light;
		double star = time/(60*60*24*365);
		
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은" + star + "광년이다.");
				

	}

}

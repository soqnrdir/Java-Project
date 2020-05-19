package examtest;

public class Quiz13 {

	public static void main(String[] args) {
		int[] array = { 38, 94, 16, 3, 76, 94, 82, 47, 59, 8 };
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {	//max값과 array[i] 에 해당하는 값을 비교해서 array[i]의 값이 크면 max가 array[i]의 값이 되도록 출력.  
				max = array[i];
			}
		}
		System.out.println(max);
	}

}

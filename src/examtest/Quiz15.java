package examtest;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int number = 0;
		String[] personName = null;
		String arrayName = "";
		String comma = " , ";  //변수들의 초기값을 선언.

		System.out.print("이름을 입력 할 인원 수를 입력하세요. : ");
		number = scanner.nextInt();		 // int타입의 변수인 number에 값을 지정.
		personName = new String[number]; // 길이가 number인 personName을 변수로 가지고 있는 배열을 생성.

		for (int i = 0; i < number; i++) { //for 문을 사용해 배열 길이인 number보다 작을 때까지 i를 증감.
			System.out.print("이름을 입력하세요 : ");
			personName[i] = scanner.next(); //나온 i의 값에 따라 문자열을 지정.
			if (i < number - 1) {           // if 문을 사용해 i 가 number-1보다 작을 땐 콤마를 같이 연산해주고,
				arrayName += personName[i] + comma;
			} else {						//그게 아니라면 콤마를 뺀 연산한 결과를 arrayName이라는 값으로 넣어준다.
				arrayName += personName[i];
			}
		}
		scanner.close();
		System.out.println(arrayName); //arrayName의 값을 출력하면 올바르게 출력된다.

	}

}

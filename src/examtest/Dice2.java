package examtest;

import java.util.Random;

public class Dice2 {

	public static void main(String[] args) {

		int[] dice = new int[6];
		System.out.println("----------");
		System.out.println("면\t 빈도");
		System.out.println("----------");
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			dice[random.nextInt(dice.length)]++; // 0번째 부터 쭉 들어감.
		}
		for (int i = 0; i < dice.length; i++) {
			System.out.println((i + 1) + "\t" + dice[i]);
		}
	
	}

}

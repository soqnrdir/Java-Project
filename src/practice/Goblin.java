package practice;

public class Goblin {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		for (;x<=10;x++) {
			for(;y<=10;y++) {
			if ((4 * x) + (5 * y) == 60)
					System.out.println("(" + x + ","+ y +")" );
			}
		}
	}
 
}


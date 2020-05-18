package practice;

public class Exam4_2 {

	public static void main(String[] args) {
		int x = 1;
		for (;x<=10;x++) {
			int y = 1;
			for(;y<=10;y++) {
				if ((4 * x) + (5 * y) == 60)
					System.out.println("(" + x + ","+ y +")" );
			}
		}
	}
 
}

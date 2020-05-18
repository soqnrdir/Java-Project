package lecture04;

public class Whilegugudan {

	public static void main(String[] args) {
		System.out.println("구구단을 시작합니다.");
		int i = 2;
	    int j = 1;
		while(i<=9) {
		System.out.println("***" + i + "단 ***");
	    		
	    while(j<=9) {
	    				
	       System.out.println(i +"x"+ j + "=" +(i*j));
	       		j++;
	    	}
	    j=1; 
		i++;
	   }
        
	}

}

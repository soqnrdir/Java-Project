package lecture11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {

	public static void main(String[] args) {
		Date date = new Date();
		String strDate1 = date.toString();
		System.out.println(strDate1);
		
		SimpleDateFormat sdf =
			new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strDate2 = sdf.format(date);
		System.out.println(strDate2);
	}

}

package lecture18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileExample {
	public static void main(String[] args) throws Exception {
//		FileInputStream inputStream = new FileInputStream(new File("/home/pc16/수업자료 DB/테이블/text.txt")); //파일 경로
//		byte[] buffer = new byte[272]; //4바이트씩  
//		while (inputStream.read(buffer) != -1) {
//			System.out.println(new String(buffer));
//		}
//		inputStream.close();
		//파일 쓰기
		FileOutputStream outputStream = new FileOutputStream(new File("/home/pc16/자바로만든파일.txt"));
		outputStream.write("자바로 파일을 만들었어요.".getBytes()); // " "안에 입력한 문자열을 바이트로 바꿔줌
		outputStream.close();
	}
}

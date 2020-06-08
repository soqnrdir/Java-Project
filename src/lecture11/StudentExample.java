package lecture11;

import java.util.HashMap;
import java.util.Map;



public class StudentExample {

	public static void main(String[] args) {
		//Student 키로 총점을 저자하는 HashMap 객체 생성
		Map<Student,String> map = new HashMap<Student, String>();
		
		//new Student("1")의 점수 95를 저장
		map.put(new Student("1"), "95");
		
		//new Student("1")로 점수를 읽어옴
		String score = map.get(new Student("1"));
		System.out.println("1번 학생의 총점: " + score);
		

	}

}

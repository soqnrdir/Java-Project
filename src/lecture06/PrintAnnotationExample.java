package lecture06;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		//Service 클래스로부터 메소드 정보를 얻음
		Method[] methods = Service.class.getDeclaredMethods(); //메서드 1~3 까지 methods안에 들어있음.
		//원래 볼 수 없지만 볼 수 있도록 해줌. = 리플랙션(정보열람가능, 양날의 검. 사용주의.)
		//Method 객체를 하나씩 처리
		for (Method method : methods) {
			//PrintAnnotation이 적용되었는지 확인
			if (method.isAnnotationPresent(PrintAnnotation.class)) {	//어노테이션이 붙었나를 확인.
				//PrintAnnotation 객체 얻기
				PrintAnnotation annotation = method.getAnnotation(PrintAnnotation.class);
				//메소드 이름 출력 
				System.out.println("[" + method.getName() + "]");
				//구분선 출력
				for (int i = 0; i < annotation.number(); i++) {
					System.out.print(annotation.value());
				}
				System.out.println();
				
				try {
				// 메소드 호출
				method.invoke(new Service()); //invoke = 프로그램 자체에서 자바소스코드를 호출하는것.
				} catch (Exception e) {}
				System.out.println(); //실행내용 1~3
			}
		}
	}

}
/* Service service = new Service();
service.method1(); 개발자가 콜 */
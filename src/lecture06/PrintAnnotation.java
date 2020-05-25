package lecture06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = /*하나는 value 생략이 가능함.*/ {ElementType.METHOD, ElementType.FIELD}) //대상 지정 =VALUE 배열타입이니 중괄호.
@Retention(RetentionPolicy.RUNTIME)//얼마만큼 유지 할 것인가.
public @interface PrintAnnotation {
	String value() default "-"; //구현되는 것이아니라 형태만 갖춰줌. 메서드가아닌 value(); 라는 함수형태의 문자열을 받는 역할을함.
	int number() default 15;
}

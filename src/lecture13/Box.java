package lecture13;

public class Box<T> { //제너릭 타입은 사용자 정의로 정해줄 수 있다.대문자로 쓰는 것이 좋다.
	private T object;
	public T getObject() {
		return object;
	}
	public void setObject(T object) { //모든 데이터가 들어갈 수 있음
		this.object = object;
	}
	public static <R> Box<R> boxing(R t) { //여기에 있는 T 는 메서드에 사용하는 T이다. 위의 필드와는 다른 T
		Box<R> box = new Box<>();
		box.setObject(t);
		return box;
	}
}

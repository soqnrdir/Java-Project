package lecture13;

public class Product<K, M> { //여러개의 제너릭을 쓸 수 있다.
	private K kind;
	private M model;
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}

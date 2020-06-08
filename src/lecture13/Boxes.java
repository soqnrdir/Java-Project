package lecture13;

public class Boxes<T> {
	private  Object[] objects;
	private int index;
	public Boxes(int size) {
		objects =new Object[size];
	}
	public void addObject(T object) {
		objects[index++] = object;
	}
	public Object[] getObjects() {
		return objects;
	}

	public void setObjects(T[] objects) {
		this.objects = objects;
	}
	
}

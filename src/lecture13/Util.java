package lecture13;

public class Util {
	public static<T extends Number> int compare(T t1, T t2) { //타입을 한정하고 싶을때.. 
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}

	public static void main(String[] args) {
		Util.compare(10,20);
	}

}

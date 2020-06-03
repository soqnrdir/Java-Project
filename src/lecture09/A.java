package lecture09;

public class A {
	public A() {
		// TODO Auto-generated constructor stub
	}

	class B {
		public B() {
		}
		int field1;
		void method1() {}
	}

	static class C {
		public C() {
		}
		int field1;
		void method1() {}
		static void method2() {} //사용하려면 생성해 주어야함!! 예외적으로 static 생성을 따로 안해도 사용가능.
	}

	void method() {
		class D {
			public D() {

			}
			int field1;
			void method1() {
			}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}//메소드 안에서 실행되고 끝난다. 1회성 클래스. 

}
//이런것이 있다라고만 알아두자.

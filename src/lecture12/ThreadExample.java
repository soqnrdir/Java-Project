package lecture12;

public class ThreadExample {

	public static void main(String[] args) {
		// 쓰레드 사용
		// 1. Runnable 인터페이스 구현
//		Runnable runnable = new Runnable() { // \
//			@Override
//			public void run() {
//				for (int i = 1; i <= 10; i++) {
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println("집중해!"); // -> 쓰레드로 처리.
//				}
//			}
//		};
//		Thread thread = new Thread(runnable);
//		thread.start();

		// 2. Thread 상속
		Thread thread = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("집중해!");
				}
			}
		};
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();
		
		// 메인 쓰레드에서 실행
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}

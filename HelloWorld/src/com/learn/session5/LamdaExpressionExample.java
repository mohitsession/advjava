package com.learn.session5;

public class LamdaExpressionExample {
	public static void main(String[] args) {
		HelloThread helloThread = new HelloThread();
		Thread thread = new Thread(helloThread, "Normal Thread");
		thread.start();

		Thread thread2 = new Thread(
				() -> System.out
						.println("Hello From a Thread created using lamda : " + Thread.currentThread().getName()),
				"LamdaThread");
		thread2.start();


		print(0, (int n) -> { return n % 2 == 0;});
		
		print(0, n -> n % 2 == 0);
	}

	static void print(int num, Condition condition) {
		if (condition.test(num)) {
			System.out.println(num);
		}
	}
}

class HelloThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello From a Thread! : " + Thread.currentThread().getName());
	}

}

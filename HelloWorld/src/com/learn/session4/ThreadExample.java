package com.learn.session4;

public class ThreadExample {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread("ThreadA");
		thread1.start();

		MyThread thread_duplicate = new MyThread("ThreadDUplicate");
//		thread_duplicate.start();
		
		MyTask task = new MyTask("ThreadB");
		Thread thread2 = new Thread(task);

		thread2.start();

		System.out.println("Main Thread Execution");
	}
}

class MyThread extends Thread {

	private String name;

	public MyThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(name + " extends Thread Class . Count : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyTask implements Runnable {

	private String name;

	public MyTask(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(name + " implements Runnable Interface . Count : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

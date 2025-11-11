package com.learn.session4;

public class ThreadSyncExample {

	public static void main(String[] args) throws InterruptedException {
		SafeCounter counter = new SafeCounter();
		Task task1 = new Task(counter);
		Task task2 = new Task(counter);

		Thread thread1 = new Thread(task1, "Thread1");
		Thread thread2 = new Thread(task2, "Thread2");

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();
		System.out.println("Final Value of Counter : " + counter.getCount());
	}

}

class Counter {
	private int count = 0;

	public void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
}

class SafeCounter {
	private int count = 0;

	public void increment() {
		count++;
		System.out.println("Name of the Thread : " + Thread.currentThread().getName() + " Counter Value : " + count);
	}

	public int getCount() {
		return count;
	}
}

class Task implements Runnable {

	private SafeCounter counter;

	public Task(SafeCounter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			counter.increment();
		}
	}

}

package demo;

public class Thread_Priority_Demo extends Thread {
	public void run() {
		System.out.println("Thread "+ Thread.currentThread().getName()+ "running");
	}
	public static void main(String[] args) {
		Thread_Priority_Demo t1 = new Thread_Priority_Demo();
		Thread_Priority_Demo t2 = new Thread_Priority_Demo();
		Thread_Priority_Demo t3 = new Thread_Priority_Demo();
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Priority of thread " + t1.getName() + " : " + t1.getPriority());
		System.out.println("Priority of thread " + t2.getName() + " : " + t2.getPriority());
		System.out.println("Priority of thread " + t3.getName() + " : " + t3.getPriority());
	}

}

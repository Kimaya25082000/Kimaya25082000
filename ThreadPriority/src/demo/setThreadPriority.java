package demo;

public class setThreadPriority extends Thread {
	public void run() {
		System.out.println("Thread "+ Thread.currentThread().getName()+ "started");
		System.out.println("Thread with priority" + Thread.currentThread().getPriority() + "is running");
	}
	public static void main(String[] args) {
		setThreadPriority t1 = new setThreadPriority();
		setThreadPriority t2 = new setThreadPriority();
		setThreadPriority t3 = new setThreadPriority();
		t1.setPriority(3);
		t2.setPriority(9);
		t3.setPriority(11);
		t1.start();
		t2.start();
		t3.start();
	}

}

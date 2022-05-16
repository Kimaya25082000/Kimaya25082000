package demo;

public class HelloThread extends Thread {
	public void run() {
		System.out.println("Hello...Welcome to Capgemini");
	}

	public static void main(String[] args) {
		HelloThread a = new HelloThread();
		a.start();

	}

}

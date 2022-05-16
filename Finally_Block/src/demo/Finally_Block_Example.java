package demo;

public class Finally_Block_Example {

	public static void main(String[] args) {
		try {
			int data = 25/5;
			System.out.println(data);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is always excueted");
		}
	}

}

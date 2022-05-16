package demo;

public class Try_Catch {

	public static void main(String[] args) {
		try {
			int data=500/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}

}

package javagenerics;

public class GenericMethod {
	public <T> void methodgen(T var1) {
		System.out.println("The value passed is of type"+var1.getClass().getSimpleName());
	}
	public static void main(String[] args) {
		GenericMethod obj = new GenericMethod();
		obj.<String>methodgen("Hello");
		
		obj.methodgen("Learning Java");
		obj.methodgen(154);

	}

}

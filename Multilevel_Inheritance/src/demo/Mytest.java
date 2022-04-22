package demo;
class One{
	void disp1() {
		System.out.println("One");
	}
}
class Two extends One{
	void disp2() {
		System.out.println("Two");
	}
}
class Three extends Two{
	void disp3() {
		System.out.println("Three");
	}
}
class Four extends Three{
	void disp4() {
		System.out.println("Four");
	}
}
public class Mytest {

	public static void main(String[] args) {
		Four obj = new Four();
		obj.disp1();
		obj.disp2();
		obj.disp3();
		obj.disp4();

	}

}

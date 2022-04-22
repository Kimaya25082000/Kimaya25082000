//Single Inheritance

package Demo;

class Parent{
	void bike() {
		System.out.println("HERO");
	}
}
class Child extends Parent{
	void cycle() {
		System.out.println("Atluse");
	}
}
public class Mytest {
	public static void main(String[] args) {
		Child c = new Child();
		c.bike();
		c.cycle();
	}
}

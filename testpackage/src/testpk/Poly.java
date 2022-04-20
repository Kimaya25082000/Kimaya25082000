package testpk;

public class Poly {
	void add(int x , int y) {
		System.out.println("Add two number:"+(x+y));
	}
	void add(int x , int y , int z) {
		System.out.println("Add two number:"+(x+y+z));
	}

	public static void main(String[] args)
	{
		Poly obj1 = new Poly();
		obj1.add(3,4);
		obj1.add(6, 4,3);
	}

}

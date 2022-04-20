package kimaya;

public class P1 
{
	int year_of_purchase;
	String name;
	int model;
	double cost;
	
	public void display1() {
		System.out.println("Year of Purchase:" +2001);
		System.out.println("Name:"+"suzuki");
	}
	public void display2() {
		System.out.println("Model:" +1999);
		System.out.println("Cost:" +200000);
	}

	public static void main(String[] args) {
		P1 obj1 = new P1();
		obj1.display1();
		obj1.display2();

	}

}

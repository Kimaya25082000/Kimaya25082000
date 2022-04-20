package testpk;

abstract class atm {
	abstract void withdraw();
}

public class DataAbstraction extends atm
{
    void withdraw() {
    	System.out.println("Withdraw Sucessfully");
    }
	public static void main(String[] args) 
	{
		DataAbstraction obj1 = new DataAbstraction();
		obj1.withdraw();

	}

}

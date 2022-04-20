package testpk;

class withdraw{
	int amt_withdraw = 20000;
}
public class atm  extends withdraw
{
	int amt_left = 5000;
    public static void main(String[] args) 
    {
		atm obj1 = new atm();
		System.out.println("Amount Withdraw:" +obj1.amt_withdraw);
		System.out.println("Amount Left:" +obj1.amt_left);

	}

}

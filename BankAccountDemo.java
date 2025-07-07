package PolymorphismDemo;
class BankAccount
{
	//overridden method
	public void calculateInterest()
	{
		System.out.println("Calculating Intrest for generic bank Account");
	}
}
class SavingAccount extends BankAccount
{
	@Override
	//overriding
	public void calculateInterest()
	{
		System.out.println("Calculating 5% Intrest for saving bank Account");
	}
}
class FixedDempositeAmount extends BankAccount
{
	@Override
	//overriding
	public void calculateInterest()
	{
		System.out.println("Calculating 7% Intrest for Fixed bank Account");
	}
}
public class BankAccountDemo  {

	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.calculateInterest();
		SavingAccount s=new SavingAccount();
		s.calculateInterest();
		FixedDempositeAmount f=new FixedDempositeAmount();
		f.calculateInterest();

	}

}

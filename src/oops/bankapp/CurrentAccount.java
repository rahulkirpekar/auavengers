package oops.bankapp;

public class CurrentAccount extends Account
{
	private double overdraftLimit;

	public CurrentAccount(String accNo, String ownerName, double balance, double overdraftLimit) 
	{
		super(accNo, ownerName, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) 
	{
		if(amount <= 0) 
		{
			 System.out.println("Withdraw amount must be positive.");
			 return ;
		}
		if(amount > (balance + overdraftLimit) ) 
		{
			System.out.println("Exceeded overdraft limit for current account.");
		}else 
		{
			balance = balance - amount;
		    System.out.printf("₹%.2f withdrawn. New balance: ₹%.2f%n", amount, balance);
		}
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
}

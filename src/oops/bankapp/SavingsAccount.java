package oops.bankapp;

public class SavingsAccount extends Account
{
	private double interestRate; 
	
	 public SavingsAccount(String accNo, String ownerName, double initialDeposit, double interestRate) 
	 {
	        super(accNo, ownerName, initialDeposit);
	        this.interestRate = interestRate;
	 }
	@Override
	public void withdraw(double amount) 
	{
		if (amount <= 0) 
		{
			 System.out.println("Withdraw amount must be positive.");
	         return;
		}
		
		if(amount > balance)
		{
			System.out.println("Insufficient funds in savings account.");
		}else 
		{
			 balance -= amount;
			 System.out.printf("₹%.2f withdrawn. New balance: ₹%.2f%n", amount, balance);
		} 		
	}
	public void applyAnnualInterest() 
	{
		double interest = balance * (interestRate / 100.0);

		balance += interest;
		
		System.out.printf("Interest ₹%.2f applied. New balance: ₹%.2f%n", interest, balance);
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) 
	{
		this.interestRate = interestRate;
	}
}

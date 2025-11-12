package oops.bankapp;

public class BankApp 
{
	private Account accounts[];
	private int count;

	public BankApp(int size) 
	{
		accounts = new Account[size];
		count = 0;
	}
	
	public void createSavingsAccount(String owner, double amount, double rate) 
	{
		 String accNo = "S" + (count + 1);
		 accounts[count++] = new SavingsAccount(accNo, owner, amount, rate);
		 System.out.println("Savings Account created successfully! Account No: " + accNo);
	}
	
	public void createCurrentAccount(String owner, double amount, double limit) 
	{
		 String accNo = "C" + (count + 1);
		 accounts[count++] = new CurrentAccount(accNo, owner, amount, limit);
		 System.out.println("Current Account created successfully! Account No: " + accNo);
	}
	// findAccount
	public Account findAccount(String accNo) 
	{
		for (int i = 0; i < accounts.length; i++) 
		{
			if (accounts[i].getAccNo().equals(accNo)) 
			{
				return accounts[i];
			}
		}
		return null;
	}
	// transfer
	public void transfer(String fromAcc , String toAcc, double amount) 
	{
		Account from = findAccount(fromAcc);
		Account to = findAccount(toAcc);		

		double prevBalance = from.getBalance();
		
		from.withdraw(amount);
		
		if(from.getBalance() < prevBalance) 
		{
			to.deposite(amount);
			System.out.println("Transferred ₹" + amount + " from " + fromAcc + " to " + toAcc);
		}
		
	}
	
	// showAllAccounts
	public void showAllAccounts() 
	{
		if (count==0) 
		{
			System.out.println("No Account in the Bank.");
		} 
		else 
		{
			for (int i = 0; i < count; i++) 
			{
				accounts[i].getDetails();
			}
		}
	}
	// applyInterestAll
	public void applyInterestAll() 
	{
		for (int i = 0; i < accounts.length; i++) 
		{
			if(accounts[i] instanceof SavingsAccount) 
			{
				((SavingsAccount)accounts[i]).applyAnnualInterest();
			}
		}
	}
}

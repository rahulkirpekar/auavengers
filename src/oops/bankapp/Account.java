package oops.bankapp;

public abstract class Account 
{
	 private final String accNo;
	 private String ownerName;
	 protected double balance;
	 
	 public Account(String accNo, String ownerName, double balance) 
	 {
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	 }
	 public String getOwnerName() {
		 return ownerName;
	 }
	 public void setOwnerName(String ownerName) {
		 this.ownerName = ownerName;
	 }
	 public double getBalance() {
		 return balance;
	 }
	 public void setBalance(double balance) {
		 this.balance = balance;
	 }
	 public String getAccNo() {
		 return accNo;
	 }
	 
	 public void deposite(double amount) 
	 {
		 if(amount <= 0) 
		 {
			 System.out.println("Deposite amount must be positive.");
		 }else 
		 {
			 balance += amount;
			 System.out.printf("₹%.2f deposited. New balance: ₹%.2f%n", amount, balance);
		 }
	 }
	 public abstract void withdraw(double amount);
	 
	 public String getDetails() 
	 {
	        return String.format("Account accNo: %s | Owner: %s | Type: %s | Balance: ₹%.2f",
	        		accNo, ownerName, this.getClass().getSimpleName(), balance);
	 }
}
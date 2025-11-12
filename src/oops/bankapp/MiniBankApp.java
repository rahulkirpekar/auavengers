package oops.bankapp;

import java.util.Scanner;

public class MiniBankApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		BankApp bank = new BankApp(50);	
		
		boolean exit = false;
		
		while(!exit) 
		{
			System.out.println("\n=== MINI BANK MENU ===");
	        System.out.println("1. Create Account");
	        System.out.println("2. Deposit");
	        System.out.println("3. Withdraw");
	        System.out.println("4. Transfer");
	        System.out.println("5. Show Account");
	        System.out.println("6. Show All Accounts");
	        System.out.println("7. Apply Interest (Savings)");
	        System.out.println("0. Exit");
	        System.out.print("Enter choice: ");
	        int choice = sc.nextInt();
	        sc.nextLine();
	        
	        switch(choice) 
	        {
		        case 1:
			        		System.out.print("Enter Owner Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Account Type (S/C): ");
	                    char type = sc.next().toUpperCase().charAt(0);
	                    System.out.print("Initial Deposit: ");
	                    double amt = sc.nextDouble();
	                    
	                    if (type == 'S') 
	                    {
	                        System.out.print("Interest Rate: ");
	                        double rate = sc.nextDouble();
	                        bank.createSavingsAccount(name, amt, rate);
	                    } else if (type == 'C') 
	                    {
	                        System.out.print("Overdraft Limit: ");
	                        double limit = sc.nextDouble();
	                        bank.createCurrentAccount(name, amt, limit);
	                    } else 
	                    {
	                        System.out.println("Invalid type!");
	                    }
		        		break;
		        		
		        case 2:
		        	  	    System.out.print("Account No: ");
	                    String dacc = sc.next();
	                    System.out.print("Deposit Amount: ");
	                    double damt = sc.nextDouble();
	                    
	                    Account da = bank.findAccount(dacc);
	                    
	                    if (da != null) 
	                    {
	                    		da.deposite(damt);
	                    }
	                    else 
	                    {
	                    		System.out.println("Account not found!");
	                    }
	        			break;
	        			
		        case 3: System.out.print("Account No: ");
		                String wacc = sc.next();
		                System.out.print("Withdraw Amount: ");
		                double wamt = sc.nextDouble();
		                
		                Account wa = bank.findAccount(wacc);
		                
		                if (wa != null) 
		                {
		                		wa.withdraw(wamt);
		                }		                
		                else
		                {
		                		System.out.println("Account not found!");
		                }
	        			break;
	        			
		        case 4:
		        		System.out.print("From Account: ");
		                String f = sc.next();
		                System.out.print("To Account: ");
		                String t = sc.next();
		                
		                System.out.print("Amount: ");
		                double a = sc.nextDouble();
		                
		                bank.transfer(f, t, a);
	        			break;
	        			
		        case 5:	System.out.print("Account No: ");
		        			String sacc = sc.next();
		        		
		                Account sa = bank.findAccount(sacc);
		                
		                if (sa != null) 
		                {	
		                		System.out.println(sa.getDetails());
		                }else 
		                { 
		                		System.out.println("Account not found!");
		                }
		                break;
        				
		        case 6: bank.showAllAccounts();
        					break;
        				
		        case 7: bank.applyInterestAll();
    						break;
    					
		        case 0: exit = true;
			        		System.out.println("Thank you for using Mini Bank!");
	    					break;
	    					
	    			default:
	    					System.out.println("Invalid Choice!");
	        }
		}
	}
}
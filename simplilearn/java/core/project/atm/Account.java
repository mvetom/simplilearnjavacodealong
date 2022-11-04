package simplilearn.java.core.project.atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account
{
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	public int setCustomerNumber(int customerNumber)
	{
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber()
	{
		return customerNumber;
	}
	
	public int setPinNumber(int pinNumber) 
	{
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber()
	{
		return pinNumber;
	}
	
	public double getCheckingBalance()
	{
		return checkingBalance;
	}
	
	
	public double getSavingBalance()
	{
		return savingBalance;
	}
	
	public double calcCheckingWithdraw(double amount)
	{
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	public double calcSavingWithdraw(double amount) 
	{
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	public double calcCheckingDeposit(double amount) 
	{
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	public double calcSavingDeposit(double amount)
	{
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	public void getCheckingWithdrawInput()
	{
		System.out.println("Checking Account Balance:" + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from Checking Account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance - amount) >= 0)
		{
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
		}
		else
		{
			System.out.println("Balance Cannot be Negative." + "\n");
		}		
	}
	
	public void getSavingWithdrawInput()
	{
		System.out.println("Savings Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from account: ");
		
		double amount = input.nextDouble();
		
		if((savingBalance - amount)  >= 0)
		{
			calcSavingWithdraw(amount);
			System.out.println("New Savings Account Balance: " + moneyFormat.format(savingBalance));
		} 
		else
		{
		   System.out.println("Balance Cannot be Negative");	
		}
	}
	
	public void getCheckingDepositInput()
	{
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to Deposit into Checking Account: ");
		double amount = input.nextDouble();
		
		if((amount) >= 0) 
		{
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
		}
		else
		{
			System.out.println("Deposit amount cannot be negative.  Were you trying to withdraw?\n");
			// ideally I would provide a check here and then recall this method if the user said yes
		}
		
	}
  
	
	public void getSavingDepositInput()
	{
		System.out.println("Savings Account Balance: "  + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to Deposit into Savings Account");
		double amount = input.nextDouble();
		
		if(amount  >= 0) 
		{
			calcSavingDeposit(amount);
			System.out.println("New Savings Account Balance: " + moneyFormat.format(savingBalance));
		}
		else 
		{
			System.out.println("Deposit Amount cannot be negative.  Were you trying to withdraw?");
		}
	}
	
	
}

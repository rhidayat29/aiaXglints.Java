package oop.aia.day2;

public class SavingsAccount {

	int balance;

	public SavingsAccount(int initialBalance){
		balance = initialBalance;
	}

	//method checkBalance
	public void checkBalance(){
		System.out.println("Hello!");
		System.out.println("Your balance is " + balance);
	}
	//method amoutToDeposit
	public void deposit(int amountToDeposit){
		balance = amountToDeposit + balance;
		System.out.println("You just deposited "+ amountToDeposit+ "!");
	}
	//method withdraw
	public int withdraw(int amountToWithdraw){
		balance = balance - amountToWithdraw;
		System.out.println("You just withdrew " + amountToWithdraw);

		return amountToWithdraw;
	}

	public static void main(String[] args){
		SavingsAccount savings = new SavingsAccount(2000);

		//call method ()
		savings.checkBalance();
		savings.deposit(5000);
		savings.withdraw(100);
		savings.withdraw(100);
		savings.withdraw(100);
		savings.checkBalance();

		// so you could simply call the method instead you write the method over and over again, like this
		// =====>>>

		System.out.println("============");

		//Check balance:
		System.out.println("Hello!");
		System.out.println("Your balance is "+savings.balance);

		//Withdrawing:
		int afterWithdraw = savings.balance - 300;
		savings.balance = afterWithdraw;
		System.out.println("You just withdrew "+300);

		//Check balance:
		System.out.println("Hello!");
		System.out.println("Your balance is "+savings.balance);

		//Deposit:
		int afterDeposit = savings.balance + 600;
		savings.balance = afterDeposit;
		System.out.println("You just deposited "+600);

		//Check balance:
		System.out.println("Hello!");
		System.out.println("Your balance is "+savings.balance);

		//Deposit:
		int afterDeposit2 = savings.balance + 600;
		savings.balance = afterDeposit2;
		System.out.println("You just deposited "+600);

		//Check balance:
		System.out.println("Hello!");
		System.out.println("Your balance is "+savings.balance);

	}       
}

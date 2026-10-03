package oopsInDetails;

public class Accounts {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.AccountNumber=243546576;
		b1.HolderName="Sandy";
		b1.balance=9000;
		System.out.println("Account 1 details :- Account number is-"+b1.AccountNumber+", Account holder's name-"+b1.HolderName+" account balance is "+b1.balance);
		BankAccount b2 = new BankAccount();
		b2.AccountNumber=238764738;
		b2.HolderName="lalit";
		b2.balance=80090;
		System.out.println("Account 2 details :- Account number is-"+b2.AccountNumber+", Account holder's name-"+b2.HolderName+" account balance is "+b2.balance);
		
		b1.balance += 5000;
		System.out.println(" 5000 is credited in account 1.");
		System.out.println("Current Account balance of account 1 is "+b1.balance);
	}
}

class BankAccount{
	int AccountNumber;
	String HolderName;
	double balance;
}
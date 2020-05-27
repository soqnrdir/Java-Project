package exam7;

public class BankAccount {


private int balance;
 
 public BankAccount(int balance) {
	 this.balance = balance;
 }
 public int getBalance() {
		return balance;
	}
public void deposit(int amount) {
		balance += amount;
}
public boolean withdraw(int amount) {
		return false;
}
public boolean transfer(int amount, BankAccount otherAccount) {
	 	return false;
}

}

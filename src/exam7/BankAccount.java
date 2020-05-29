package exam7;

public class BankAccount {

	protected int balance;

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
		if (balance >= amount) {
			balance -= amount;
			return true;
		} else {
			return false;
		}

	}
	public boolean transfer(int amount, BankAccount otherAccount) {
		if (balance >= amount) {
			balance -= amount;
			otherAccount.balance += amount;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "잔액: " + String.format("%,d",balance);
	}

}


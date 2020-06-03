package exam7;

public abstract class BankAccount {

	protected int balance;

	public abstract String getAccountType();

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		if (amount < 0) {
			System.err.println("잘못 입력하셨습니다."); // out 대신에 err면 빨간색으로 표시
			return;
		}
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

	public boolean transfer(int amount, BankAccount otherAccount)
			throws IllegalArgumentException, NullPointerException {

		if (balance >= amount) {
			balance -= amount;
			otherAccount.balance += amount;
			return true;
		} else if (amount < 0 || balance < amount) {
			throw new IllegalArgumentException();

		} else if (otherAccount == null) {
			throw new NullPointerException();
		}
		return false;
	}

	@Override
	public String toString() {
		return "잔액: " + String.format("%,d", balance);
	}

}

package exam7;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.setProtectedBy(protectedBy);
	}

	@Override
	public boolean withdraw(int amount) {
		if (balance < amount) {
		protectedBy.balance = (balance - amount) + protectedBy.balance ;
		
		}
		balance = 0;
		return true;
	}

	public SavingsAccount getProtectedBy() {
		return protectedBy;
	}

	public void setProtectedBy(SavingsAccount protectedBy) {
		this.protectedBy = protectedBy;
	}

	@Override
	public String getAccountType() {
		return "당좌예금";
	}
 
}

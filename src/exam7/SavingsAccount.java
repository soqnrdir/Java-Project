package exam7;

public class SavingsAccount extends BankAccount {
	private double interestRate; //이자율
	
	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	
	
	
	public void  updateBalance(int period) {
		this.balance = (int) (super.balance * interestRate * period +super.balance);
		 

	}



				
	}



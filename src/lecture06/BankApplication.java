package lecture06;

import java.util.Scanner;

public class BankApplication {
	private BankAccount[] accounts = new BankAccount[100];
	private void createAccount(String accountNo, String owner, int balance) {
		for (int i=0; i <accounts.length; i++) {
			if ( accounts[i] == null) {
				
			}
		}
	}
	public void deposit(String accountNo, int amount) {
		BankAccount account = findAccount(accountNo);
		account.setBalance(account.getBalance() + amount);
	}
	
	
	
	public BankAccount findAccount(String accountNo) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getAccountNo().equals(accountNo)) {
			return accounts[i];
			
		}
	}
	
}
}
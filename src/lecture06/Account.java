package lecture06;

public class Account {
	private int balance;
	public static final int MIN_BALANCE = 0;			//상수는 외부에서 쓰일일이 많아 보통 public을 붙인다.
	public static final int MAX_BALANCE = 1_000_000;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
	if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
		this.balance = balance;
		}
	
		}
	
}

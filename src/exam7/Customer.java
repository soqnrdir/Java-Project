package exam7;



public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount[] accounts;
	private int numberOfAccounts;

	public Customer(String firstName, String lastname) {
		this.firstName = firstName;
		this.lastName = lastname;
		this.accounts = new BankAccount[5];

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void addAccount(BankAccount customer) {
		accounts[numberOfAccounts] = customer;
		numberOfAccounts++;
	}

	public BankAccount getAccount(int index) {
		return accounts[index];
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	@Override
	public String toString() {
		return  firstName + " " + lastName + " " + "계좌의 갯수: " + String.format("%,d",getNumberOfAccounts());
	}


	

}

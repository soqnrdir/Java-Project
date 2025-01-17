package exam7;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;

	public Bank() {
		this.customers = new Customer[10];
	}

	public void addCustomer(Customer customer) {
		customers[numberOfCustomers] = customer;
		numberOfCustomers++;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer getCustomer(int index) {
		return customers[index];
	}

	public Customer[] getCustomers() {
		return customers;
	}

}

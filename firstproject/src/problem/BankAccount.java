package problem;

import problem.BankCustomer;

public class BankAccount {
	 	private BankCustomer bankCustomer;
	    private double balance;
		public BankCustomer getCustomer() {
			return bankCustomer;
		}
		public void setCustomer(BankCustomer bankCustomer) {
			this.bankCustomer = bankCustomer;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		@Override
		public String toString() {
			return "BankAccount [customer=" + bankCustomer + ", balance=" + balance + "]";
		}
}

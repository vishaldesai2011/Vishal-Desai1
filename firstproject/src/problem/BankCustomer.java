package problem;

public class BankCustomer {
	private String firstname,lastname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "BankDetails [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
}

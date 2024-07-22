package selfstudy;

public class Author {
	private String fname,lname;

	public Author(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "\nAuthor [fname=" + fname + ", lname=" + lname + "]";
	}
	
	
}
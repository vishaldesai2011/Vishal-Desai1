package firstproject;

public class Student1 {

	private int rollno;
	private String name;
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + "]";
	}
	
}

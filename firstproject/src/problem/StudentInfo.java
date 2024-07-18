package problem;
import java.util.*;


class StudentInfo {
    private String firstName,lastName,year,major;
   

	public StudentInfo(String firstName, String lastName, String year, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.major = major;
    }


	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", year=" + year + ", major=" + major
				+ "]";
	}
	
	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo("Aryan","Prajapati","High Level","Data Analyst");
		StudentInfo s2 = new StudentInfo("Shubham","Gadhiya","Lower Level","FullStack Developer");
		
		System.out.println(s1);
		System.out.println(s2);
	}
	
	
}

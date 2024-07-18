package firstproject;

public class StudentDetails {

	public static void main(String[] args) {
		
		student s1 = new student();
		s1.getdata();
		s1.display();
		
		
		// student1 class object for getter setter
		Student1 s11 = new Student1();
		s11.setRollno(100);
		System.out.println(s11.getRollno());
		s11.setName("Aryan Prajapati");
		System.out.println(s11.getName());
		
		System.out.println(s11);

	}

}

package arrayofobject;
import java.util.*;
import firstproject.Employee;

public class ArrayOfEmployee {
	
	public void CreateArrayOfEmployee() {
		
		Scanner sc = new Scanner(System.in);
		int[] no = new int[12];
		Employee[] emp = new Employee[10];
	
		for(int i=0;i<3;i++) {
			emp[i] = new Employee();
		}
		for(int j=0;j<3;j++) {
			System.out.println("Enter Name : ");
			emp[j].setName(sc.next());
			System.out.println("Enter Designation : ");
			emp[j].setDesignation(sc.next());
			
		}
		for(int k=0;k<3;k++) {
			System.out.println(emp[k]);
		}
		
		
	}

}

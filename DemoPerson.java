package classrelationexample.hashrelation;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address add = new Address();
		add.setFlatno("3");
		add.setSocityname("Hare Krishna Row House");
		add.setArea("Ahmedabad");
		add.setPincode(380058);
		
		
		Person ps = new Person();
		ps.setAddr(add);
		ps.setPemail("vd81243@gmail.com");
		ps.setPname("Vishal Desai");
		System.out.println(ps);
	// injection object of address class to person class 
	
	}
	

}

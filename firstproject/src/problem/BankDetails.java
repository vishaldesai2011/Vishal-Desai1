package problem;

public class BankDetails {
	
	public static void main(String[] args) {
        BankCustomer cust1 = new BankCustomer();
        BankCustomer cust2 = new BankCustomer();
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        
        cust1.setFirstname("Aryan");
        cust1.setLastname("Prajapati");
        cust2.setFirstname("Dhaval");
        cust2.setLastname("Gohel");
        
        account1.setCustomer(cust1);
        account1.setBalance(100000.0);
        account2.setCustomer(cust2);
        account2.setBalance(200000.0);
        
//        System.out.println(cust1);
//        System.out.println(cust2);
//        
        System.out.println(account1);
        System.out.println(account2);
        
        
       
	}

}

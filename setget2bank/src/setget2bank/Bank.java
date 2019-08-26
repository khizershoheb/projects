package setget2bank;

public class Bank{

	public static void main(String[] args) {
		
        Account account1=new Account(1, "khizer", 1000.00, "savings");
 
        System.out.println("account:1\r"+account1.getaccountno());
        System.out.println(account1.getaccountholdername()+"\r" +account1.getbal() +"\r" +account1.gettype()+"\r");
        
  Account account2=new Account();

	        System.out.println("account:2\r"+account2.getaccountno());
	        System.out.println(account2.getaccountholdername()+"\r" +account2.getbal() +"\r" +account2.gettype()+"\r");
	        
     account2.setaccountno(2); 
     account2.setaccountholdername("shoheb"); 
     account2.setbal(5000.00);
     account2.settype("current");
        
        System.out.println("account:2\r"+account2.getaccountno()+"\r"+ account2.getaccountholdername()+ "\r"+account2.getbal()+"\r" +account2.gettype());
      
     
        
    
	}

}

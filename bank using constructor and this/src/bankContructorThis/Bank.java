package bankContructorThis;

public class Bank{

	public static void main(String[] args) {
		
        Account account1=new Account(1, "khizer", 1000.00, "savings");
		/*
		 * account1.accountno=1; account1.accountholdername="rama";
		 * account1.bal=1000.55; account1.type="savings";
		 */
   
   
		
        /*
		 * account2.accountno=2; account2.accountholdername="khizer";
		 * account2.bal=500.22; account2.type="current";
		 */
      
        System.out.println(account1.accountholdername);
        System.out.println(account1.accountno+"\r" +account1.bal+"\r" +account1.type+"\r");
        
        Account account2=new Account(2,"shoheb", 2000.00, "current");
        
        System.out.println(account2.accountholdername);
        System.out.println(account2.accountno+"\r" +account2.bal +"\r"+account2.type+"\r");
        
        Account account3=new Account(account2);
        
        System.out.println(account3.accountholdername+"\r"+ account3.accountno+ "\r"+account3.bal+ account3.type);
      
     
        
    
	}

}


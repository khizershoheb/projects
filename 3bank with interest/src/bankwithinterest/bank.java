package bankwithinterest;

public class bank{

	public static void main(String[] args) {

        Account account3=new Account(3,"Asif");
       
        System.out.println("\r"+account3.getaccountno());
        System.out.println(account3.getaccountholdername()+"\r" +account3.getbal() +"\r" +account3.gettype()+"\r");
        
        bank Bank=new bank();
        double principalafterinterest=Bank.principalinterest(account3.getbal(), 6);
        account3.setbal(principalafterinterest);
       
        System.out.println("\rafter interest calculation:"+account3.getaccountno());
        System.out.println(account3.getaccountholdername()+"\r" +account3.getbal() +"\r" +account3.gettype()+"\r");
        double a1=account3.getbal();
        		
        Account account4=new Account(3,"Addu");
        
        System.out.println("\r"+account4.getaccountno());
        System.out.println(account4.getaccountholdername()+"\r" +account4.getbal() +"\r" +account4.gettype()+"\r");
        
 
        principalafterinterest=Bank.compoundinterest(account4.getbal(),12,4);
        account4.setbal(principalafterinterest);
        
        System.out.println("\rafter interest calculation:"+account4.getaccountno());
        System.out.println(account4.getaccountholdername()+"\r" +account4.getbal() +"\r" +account4.gettype()+"\r");
	double a2=account4.getbal();
	System.out.println(a2-a1);
	}
	
public double principalinterest(double principal, float roi) {
	double principalafterinterest=principal+ principal*roi/100;
	return principalafterinterest;
}
public double compoundinterest(double principal, float roi, int compounded) {
	double principalafterinterest=principal*Math.pow(1+roi/(100*compounded),compounded);
	return principalafterinterest;
}
}

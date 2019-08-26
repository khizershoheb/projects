package bankwithinterest;

public class Account {
	private int accountno;
   private String accountholdername;
   private double bal;
   private String type;
      
    Account(int accountno, String accountholdername){
    	this.accountno=accountno;
    	this.accountholdername=accountholdername;
    	this.bal=5000;
    	this.type="current";
    }
 
    
    public void setaccountno(int accountno) {
    	this.accountno=accountno;
    }
    public void setaccountholdername(String accountholdername) {
    	this.accountholdername=accountholdername;
    }
    public void setbal(double bal) {
    	this.bal=bal;
    }
    public void settype(String type) {
    	this.type=type;
    }
    int getaccountno() {
    	return accountno;
    }
    String getaccountholdername() {
    	return accountholdername;
    }
    double getbal() {
    	return bal;	
    }
    String gettype() {
    	return type;
    }
    }

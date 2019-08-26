package setget2bank;

public class Account {
	private int accountno;
   private String accountholdername;
   private double bal;
   private String type;
    
    Account(){
    	accountno=0;
    	accountholdername="default";
    	bal=00.00;
    	type="default";

    }
    
    Account(int accountno, String accountholdername, double bal, String type){
    	this.accountno=accountno;
    	this.accountholdername=accountholdername;
    	this.bal=bal;
    	this.type=type;
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

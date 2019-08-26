package bankContructorThis;

public class Account {
	int accountno;
    String accountholdername;
    double bal;
    String type;
    
    Account(){
    	accountno=1;
    	accountholdername="rama";
    	bal=1000.00;
    	type="savings";

    }
    
    Account(int accountno, String accountholdername, double bal, String type){
    	this.accountno=accountno;
    	this.accountholdername=accountholdername;
    	this.bal=bal;
    	this.type=type;
    }
    
    Account(Account t){
    	this.accountno=t.accountno;
    	this.accountholdername=t.accountholdername;
    	this.bal=t.bal;
    	this.type=t.type;
 
  }
}
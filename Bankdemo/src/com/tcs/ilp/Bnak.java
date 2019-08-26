package com.tcs.ilp;

public class Bnak{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Account account1=new Account();
        account1.accountno=1;
        account1.accountholdername="rama";
        account1.bal=1000.55;
        account1.type="savings";
        
        Account account2=new Account();
        account2.accountno=2;
        account2.accountholdername="khizer";
        account2.bal=500.22;
        account2.type="current";
        System.out.println("first person  "+account1.accountholdername);
        System.out.println(account1.accountno+"\r" +account1.bal+"\r" +account1.type);
        System.out.println("secondperson  "+account2.accountholdername);
        System.out.println(account2.accountno+"\r" +account2.bal +"\r"+account2.type);
	}

}

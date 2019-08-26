package check.customer.details.in.bank;

public class CustomerUtil {
	

	public static boolean checkCustomrExistence(Customer[] arrObj, String name) {
		boolean exists=false;
		for(Customer arrobj:arrObj) {
				if(arrobj.getCustomerName().equals(name)) 
					exists=true;
		}
				return exists;
			}
	public static int knowCustomerid(Customer[] arrObj, String name, int updatedid) {
		for(Customer arrobj:arrObj) {
			if(arrobj.getCustomerName().equals(name))
				arrobj.setCustomerId(updatedid);
			return 1;
		}
		return 0;
	}
   public static int getNoAccounts(Customer[] arrObj, String name) {
	   int count=0;
	   for(Customer arrobj1:arrObj) {
		   if(arrobj1.getCustomerName().contentEquals(name))
			   count++;}
			   
			   return count;
   }
   public static int getCustomerid(Customer[] arrObj, int oldid, int updateid) {
	   for(Customer arrobj:arrObj) {
	   if(arrobj.getCustomerId()==oldid) {
		   arrobj.setCustomerId(updateid);
		   return 1;
	   }
	   }
	   return 0;
   }
   public static int[] getaccountnumbers(Customer[] arrobj,String name){
	  int[] k= new int[10];int count=0;
			  for(Customer check:arrobj) {
		   if(check.getCustomerName().contentEquals(name)) {
			   k[count]=check.getAccountNumber();
			   count++;
			  }}
	   return k;
   }
	  }

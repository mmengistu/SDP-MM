
public class Driver {	
	static BankAccount b;
	public static void main(String[] args){
		//Generics are used here to introduce two different types into a function.
		//benefit-implement generic algorithms that can be customised easily
		
		Storage<BankAccount> aStorage = new Storage<>();
		Storage<String> sStorAge = new Storage<>();
		
		//Class baCls = BankAccount.class;
		Class<BankAccount> baCls = BankAccount.class;
		{	try {
			    //Object myAccount = bacls.newInstance();
				//BankAccount myAccount = baCls.newInstance();
				//BankAccount myAccount = baCls.newInstance();
			//dynamic casting used here - casting done by JVM at runtime
				BankAccount myAccount = (BankAccount) baCls.newInstance();
				aStorage.setValue(myAccount);
				// Deposit 
				myAccount.deposit(15);
			} 
			catch ( InstantiationException ee ) { 
				// ... 
			} 
			catch ( IllegalAccessException e ) { 
				// ... 
			}
		}
		
		
		//The above code demonstrates that the storage class can be used to store any type
		
		System.out.println ("Open bank account");
	    System.out.println (aStorage.getValue().showBalance());
		
		if(aStorage.getClass()== sStorAge.getClass()){
			System.out.println("EQUAL");
		} else {
			System.out.println("NOT EQUAL");
		}
		//aStorage.setValue(900);
		//b.showBalance();
		//b.deposit(550);
		//b.showBalance();
	
	}
	
	
}
import java.util.Scanner;
public class Bank {
	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[]args) {
		
		
		
	    double balance = 0;
		boolean isRunning=true;
		int choice;
		
		while(isRunning) {
			System.out.println("*************");
			System.out.println("1. Show Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("*************");
		
			System.out.print("Enter your choice:");
		    choice=scanner.nextInt();
		
			switch(choice) {
			case 1->showBalance(balance);
			case 2->balance=balance+deposit();
			case 3->balance =balance-withdraw(balance);
			case 4->isRunning=false;
			default ->System.out.println("INVALID CHOICE");
			}
		}	
		
	  System.out.println("*************");
	  System.out.println("THank You!Have a nice day!");
	  System.out.println("*************");	  
	  
	  scanner.close();	
		
	}
	
	

	static void showBalance(double balance) {
		System.out.printf("$%f\n",balance);
	}
	
	
	
	static double deposit() {
		double amount;
		
		System.out.print("Enter an amount to be deposited:");
	    amount=scanner.nextDouble();
	    
	    
	    if(amount<0) {
	    	System.out.println("Amount can't be negative");
	    	return 0;
	    }
	    else {
	    	return amount;
	    }
	    		
	}
	
	
	static double withdraw(double balance) {
		
		double amount;
		
		System.out.println(("Enter amount to be withdraw:"));
		amount=scanner.nextDouble();
		
		if (amount>balance){
			System.out.println("Insufficient Amount");
			return 0;
		}
		else if(amount<0){
			System.out.println("Amount can't be negative");
			return 0;
		}
		else {
			return amount;
		}
		
		
	}
	
}
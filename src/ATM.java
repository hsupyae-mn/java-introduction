import java.util.Scanner;
public class ATM {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter your bank account number: ");
		int account=scanner.nextInt();
		
		System.out.println("Choose one option: "
				+ "1.Deposit money"
				+ "2.Withdraw money"
				+ "3.Exit");
		int choice=scanner.nextInt();
		
		
		int amount=100000;
	    if (choice==1) {
	    	System.out.println("Enter amount that you want to deposit please:");
	    	int deposit=scanner.nextInt();
	    	amount+=deposit;
	    	System.out.println("Your current amount is $"+ amount  );
	    }
	    else if(choice==2) {
	    	System.out.println("Enter amount that you want to withdraw: ");
	    	int withdrawal=scanner.nextInt();
	    	
	    	if(withdrawal>amount) {
	    		System.out.println("Exceeding limit!Your bank account does not have enough money");	 	
	    	}
	    	else {
	    	     amount-=withdrawal;
	    	}
	    	System.out.println("Your current amount is $"+ amount  );

	    }	
	    else if(choice==3) {
	    	System.out.println("Thank you for using us");	    	
	    }
	    else {
	    	System.out.println("Please choose between 1,2 and 3");
	    }
	    
	}

}

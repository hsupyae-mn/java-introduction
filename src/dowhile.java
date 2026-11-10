import java.util.Scanner;
import java.util.Random;
public class dowhile {
	public static void main(String[]args) {
		Random random=new Random();
		Scanner scanner=new Scanner(System.in);
		
		int guess;
		int attempts=0;
		int min=1;
		int max=100;
		
		int randomNumber=random.nextInt(min,max+1);
		
		System.out.println("Number Guessing Game");
		System.out.printf("Guess a number between 5d %d:" ,min,max);
		
		
		do {
			System.out.print("Enter a guess: ");
			guess=scanner.nextInt();
			attempts++;
			
			if(guess<randomNumber) {
				System.out.println("Too Low! Try again");
				
			}
			else if(guess>randomNumber) {
				System.out.println("Too High1 Try agian");		
			}
			else {
				System.out.println("Correct!The number was"+randomNumber);
				System.out.println("#of attempts:"+attempts);
			}
			
		}while(guess != randomNumber);
		
		scanner.close();
		
	}

}

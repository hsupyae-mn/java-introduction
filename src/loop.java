import java.util.Scanner;

public class loop {
	public static void main(String[]args) throws InterruptedException{
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your desire count");
		
		int row;
		int col;
		char symbol;
		
		System.out.print("Enter the numbre of row:");
		row=scanner.nextInt();
		
		System.out.print("Enter the numbre of col:");
		col=scanner.nextInt();
		
		System.out.print("Enter the numbre of symbol:");
		symbol=scanner.next().charAt(0);
		
		for(int i=0; i< row;i++){
			for(int j=0;j<col;j++) {
			  System.out.print(symbol);
			}
			System.out.println();
		}
		
		scanner.close();
		
	}

}
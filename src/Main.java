import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your name:");
		String name=scanner.nextLine();
		if (name.isEmpty()) {
			System.out.print("You did not enter your name😡🥶🥴");	
		}
		else {
			System.out.print("Hello"+ name + "!");
		}
		
		System.out.print("Enter your age:");
		int age=scanner.nextInt();
		if (age<=70){
			System.out.print("You are a senior😁");
		}
		else if(age>=18) {
			System.out.print("You are an adault😍");
			
		}
		else if(age==0) {
			System.out.print("You are not born yet!🫪");
		}
		else {
			System.out.print("You are a junior😃");
		}
		
		System.out.print("What is your GPA:");
		double gpa=scanner.nextDouble();
		
		System.out.print("Are you a student?(true/false):");
		boolean isStudent=scanner.nextBoolean();
		
		System.out.println("Hello"+name);
		System.out.println("You are"+age+"years old");
		System.out.println("Your GPA is"+ gpa);
        //👌😘😂💕❤️😍window+;)

		if(isStudent) {
			System.out.println("You are enrolled as a student");
		}
		else {
			System.out.println("You are not enrolled as  a student");
			
		}
		
		scanner.close();
	}
}
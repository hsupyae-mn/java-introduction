import java.util.Scanner;
public class hb {
	public static void main(String[]args) {		
		 Scanner scanner = new Scanner(System.in);

	     String fullName = getFullName(scanner);
	     System.out.println("Your full name is: " + fullName);
	     System.out.println(add(2,3));
	     System.out.println(add(2,6));
	     
		int age=21;
		
		if(ageCheck(age)) {
			System.out.println("You may sigh up!");
			
		}
		else {
			System.out.println("You must be 18+to sign up");
		}
		
	}
	
	static void happyBirthday(String name,int age) {

		System.out.println("Happy Birthday to you");
		System.out.printf("Happy Birthday to %s\n",name);
		System.out.printf("Happy Birthday to your %d years\n", age);

	}
	static double square(double number) {return number* number;}
	static double cube(double number) {
		return number*number*number;
	}
	static String getFullName(Scanner scanner) {

        System.out.print("Enter your first name: ");
        String first = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String last = scanner.nextLine();

        return first + " " + last;
    }

		
	
	static boolean ageCheck(int age) {
		if(age>=18) {
			return true;
			
		}
		else {
			return false;
		}
	}
	static double add(double a, double b) {
		return a+b;
		
	}
	static double add(double c, double d,double a) {
		return c+d;
	}
	
}

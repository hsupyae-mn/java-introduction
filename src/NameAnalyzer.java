import java.util.Scanner;
public class NameAnalyzer {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Pls enter your name");
		String name=scanner.nextLine();
		
		int length=name.length();
		
		int spaceCount=0;
		if(name.contains(" ")) {
			for(int i=0;i<name.length();i++) {
				if(name.charAt(i)==' ') {
				   spaceCount++;
				}
			}
		
			if(spaceCount==1) {
				System.out.println("Your name has "+ spaceCount+"space");
			
			}
			else{
				System.out.println("Your name has"+ spaceCount + " spaces");
			}
		}	
		else{
			System.out.println("Your name do not contain any space");	
		}
	
		
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a') {
				count++;
			
			}
			else if(name.charAt(i)=='e') {
				count++;
			}
			else if(name.charAt(i)=='i') {
				count++;
			}
			else if(name.charAt(i)=='o') {
				count++;
			}
			else if(name.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("The number of vowels in your name is "+ count);
		
		System.out.print("Enter a letter to search: ");
		String letter = scanner.nextLine();
		if (name.contains(letter)) {
		    System.out.println("Your name contains " + letter);
		} else {
		    System.out.println("Your name does not contain " + letter);
		}
		
		
		name=name.toUpperCase();
		System.out.println(name);
	}

}

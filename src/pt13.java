
public class pt13 {
	public static void main(String[]args){
	
		String name="pa sswor  d";
		
		int length=name.length();
		char letter=name.charAt(4);
		int index=name.indexOf("s");
		int lastIndex=name.lastIndexOf("s");
		
		
		name=name.toLowerCase();
		System.out.println(name);
	
		name=name.toUpperCase();
		System.out.println(name);
		
		name=name.trim();
		System.out.println(name);
		
		name=name.replace("O","l");
		System.out.println(name);
		
		System.out.println(length);
		System.out.println(letter);
		System.out.println(index);
		System.out.println(lastIndex);
		
		
		if(name.isEmpty()) {
			System.out.println("YOu got no name?");
		}
		else {
			System.out.println("Hello "+ name);

		}
		int spaceCount=0;
		if(name.contains(" ")) {
			for(int i=0; i<name.length(); i++) {
				if(name.charAt(i)==' ') {
					spaceCount++;
					
				}
			}
			if(spaceCount==1) {
				System.out.print("Your name contain "+spaceCount+" space");
			}
			else {
				System.out.print("Your name contain "+spaceCount+" spaces");
			}
			
		}
		else {
			System.out.println("Your name do not contain a space");
			
		}
		
		
		if(name.equalsIgnoreCase("password")) {
			System.out.println("Ypur name can't be password");
		}
		else {
			System.out.println("hello" + name);
		}

		
	}

}

import java.util.Random;
public class p6 {
	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		Random random=new Random();
		boolean isHeads;
		isHeads=random.nextBoolean();
		
		if(isHeads) {
			System.out.println("Head");
		}
		else {
			System.out.println("Tail");
		}
		
		double result;
			
	    result=Math.pow(2, 5);
	    System.out.print(result);;
	    

     }
}
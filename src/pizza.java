
public class pizza {
	public static void main(String[]args) {
		
		System.out.println("Order"+ bakePizza(3,"Mozerella" ,"flat bread","Pepperroni"));;
				
	}
	static String bakePizza(String bread) {
		return bread+" pizza";
	}
	static String bakePizza(String bread,String cheese) {
		return bread + " "+cheese +" "+"pizza";
	}
	static String bakePizza(int count,String bread,String cheese,String topping) {
		return count+" "+bread+" "+cheese+" "+topping+"pizza";
	}

}

package basic;

public class SwapNums {

	public static void main(String[] args) {
		int num1=5;
		int num2=10;
		
//		num1=num1+num2;
//		num2=num1-num2;
//		num1=num1-num2;
		
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		
		System.out.println("swappwed numbers are"+num1+"and"+num2);

	}

}

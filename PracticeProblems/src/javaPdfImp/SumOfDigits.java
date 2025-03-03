package javaPdfImp;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,sum=0;
		int rem=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		num=sc.nextInt();
		
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		
		System.out.println("sum of digits in num="+sum);

	}

}

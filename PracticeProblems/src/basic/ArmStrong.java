package basic;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rem,sum=0;
		int temp=num;
		while(num!=0) {
			rem=num%10;
			sum+=rem*rem*rem;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("number is armstrong");
		}else {
			System.out.println("number is not armstrong");
		}

	}

}

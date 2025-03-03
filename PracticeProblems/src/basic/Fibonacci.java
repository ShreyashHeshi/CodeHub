package basic;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int n1=0;
//		int n2=1;
//		int n3=0;
//		System.out.println("Enter range");
//		int size= sc.nextInt();
//		System.out.println(n1);
//		System.out.println(n2);
//		for(int i=0;i<size;i++) {
//			n3=n1+n2;
//			System.out.println(n3);
//			n1=n2;
//			n2=n3;
//		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int size=sc.nextInt();
		int num1=0;
		int num2=1;
		int num3=0;
		for(int i=0;i<size;i++) {
			System.out.println(num1);
			num3=num1+num2;
			num1=num2;
			num2=num3;
		}

	}

}

package basic;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		
		int sum=0;
		//int sum=1;
		
		for(int i=1;i<num;i++ ) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			System.out.println("number is perfect num");
		}else {
			System.out.println("num is not perfect num");
		}

	}

}

package basic;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int rem=0,rev=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
        if(rev==temp) {
        	System.out.println("Palindrome");
        }else {
        	System.out.println("not Palindrome");
        }
	}

}

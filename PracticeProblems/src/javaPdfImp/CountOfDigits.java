package javaPdfImp;

import java.util.Scanner;

public class CountOfDigits {

	public static void main(String[] args) {
		int num=0;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		num=sc.nextInt();
		
		if(num<0) {
			num=num*-1;
		}else if(num==0) {
			num=1;
		}
		while(num>0){
			num=num/10;
			count++;
		}
		System.out.println("count of digits="+count);

	}

}

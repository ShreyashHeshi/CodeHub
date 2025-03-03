package array_IMP;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size you want");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int max= Integer.MIN_VALUE;
		
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("max num="+ max);

	}

}

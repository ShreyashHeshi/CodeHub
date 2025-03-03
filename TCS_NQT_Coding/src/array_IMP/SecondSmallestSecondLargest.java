package array_IMP;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size you want");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println("second smallest="+arr[1]);
		System.out.println("seocond largest="+ arr[arr.length-2]);

	}

}

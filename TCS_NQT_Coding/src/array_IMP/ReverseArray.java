package array_IMP;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size= sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int left = 0;
		int right= arr.length-1;
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		
		for(int i=0;i<size;i++) {
			System.out.println("reverse array ="+ arr[i]);
		}

	}

}

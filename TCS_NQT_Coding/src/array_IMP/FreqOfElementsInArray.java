package array_IMP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqOfElementsInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size= sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		Map<Integer,Integer> map = freq(arr);
		
		System.out.println("frequncy of each element ="+map);
		

	}
	
	public static Map<Integer,Integer> freq(int[] arr){
		
		Map<Integer,Integer> map= new HashMap<>();
		
		for(int num:arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		return map;
	}

}

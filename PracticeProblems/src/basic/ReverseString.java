package basic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String st=sc.nextLine();
		
		char[] chrr=st.toCharArray();
		int low=0;
		int high=st.length()-1; // for char reverse
		while(low<high) {
			char temp=chrr[low];
			chrr[low]=chrr[high];
			chrr[high]=temp;
			
			low++;
			high--;
		}
		
		System.out.println("reverse string = "+ new String(chrr));
		
		
		
		
//		String reverseString="";
		
//		2)Method 2
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i=0;i<st.length();i++) {
//			sb.append(st.charAt(i));
//		}
//		
//		System.out.println("reverse = "+ sb.reverse().toString());
//		
//		1)Method 1
//		for(int i=st.length()-1;i>=0;i--) {
//			reverseString+=st.charAt(i);
//		}
//		System.out.println("reversed String = "+reverseString);
		
		

	}

}

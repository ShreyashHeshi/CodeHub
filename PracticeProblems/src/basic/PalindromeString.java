package basic;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String st = sc.nextLine();
		char[] crr = st.toCharArray();
		int left=0;
		int right=st.length()-1;
		while(left<right) {
			char temp=crr[left];
			crr[left]=crr[right];
			crr[right]=temp;
			left++;
			right--;
		}
		String reverse = new String(crr);
		if(st.equals(reverse)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}

	}

}

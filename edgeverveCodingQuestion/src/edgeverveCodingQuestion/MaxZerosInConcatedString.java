package edgeverveCodingQuestion;

import java.util.Scanner;

public class MaxZerosInConcatedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of string N=");
		int N=sc.nextInt();
		
		System.out.println("Enter number of copies K=");
		int K=sc.nextInt();
		
		System.out.println("Enter binary string S=");
		String S=sc.next();
		
		System.out.println("Max size of sucstring of T consisting only 0"+ maxZeroSubstring(N,K,S));
		
		// 6  3  110010
		// 3  2  000

	}

	public static int maxZeroSubstring(int N, int K, String S) {
		int maxZero=0;
		int currentZero=0;
		int prefixZero=0;
		int suffixZeros=0;
		boolean prefixCount=false;
		
		for(int i=0;i<N;i++) {
			if(S.charAt(i)=='0') {
				currentZero++;
				maxZero=Math.max(maxZero, currentZero);
				
				if(!prefixCount) {
					prefixZero++;
				}
				suffixZeros=currentZero;
			}else {
				currentZero=0;
				if(!prefixCount) {
					prefixCount=true;
				}
			}
			
		}
		if(maxZero==N) {
			return N*K;
		}
		if(K>1) {
			int combineZero=suffixZeros+prefixZero;
			return Math.max(maxZero, combineZero);
		}else {
			return maxZero;
		}
		
	}

}

package basic;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a num");
		int num=sc.nextInt();
		if(isPrime(num)) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}

	}

	private static boolean isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
//	private static boolean isPrime(int num) {
//        if (num <= 1) return false; // Handling 0, 1, and negative numbers
//
//        if (num == 2) return true; // 2 is the only even prime number
//
//        if (num % 2 == 0) return false; // Eliminate even numbers except 2
//
//        for (int i = 3; i <= Math.sqrt(num); i += 2) { // Check only odd numbers up to sqrt(num)
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

}

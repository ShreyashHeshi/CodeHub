package edgeverveCodingQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindSpecialPrime {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        int array_length = Integer.parseInt(scan.nextLine().trim());
        List<Integer> arr = new ArrayList<>(array_length);

        for (int j = 0; j < array_length; j++) {
            arr.add(Integer.parseInt(scan.nextLine().trim()));
        }

        int result = findPrime(array_length, arr);
        System.out.println(result);

        scan.close();

	}

	private static int findPrime(int array_length, List<Integer> arr) {
		
		for(int i=0;i<array_length;i++) {
			int num=arr.get(i);
			
			if(isPrime(num)) {
				if(SumOfTwo(num,arr)) {
					return i;
				}
				
			}
		}
		return 0;
	}

	private static boolean SumOfTwo(int num, List<Integer> arr) {
		for(int i=0;i<arr.size();i++) {
			for(int j=0;j<arr.size();j++) {
				if(arr.get(i)+arr.get(j)==num) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean isPrime(int num) {
	    if(num<=1) {
	    	return false;
	    }
	    for(int i=2;i<=Math.sqrt(num);i++) {
	    	if(num%i==0) {
	    		return false;
	    	}
	    }
		return true;
	}

} // 8
//6
//59
//35
//53
//53
//97
//17
//7


//9
//95
//8
//88
//21
//27
//66
//76
//97
//66


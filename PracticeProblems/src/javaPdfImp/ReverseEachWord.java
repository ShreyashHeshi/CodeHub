package javaPdfImp;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new String");
		String str = sc.nextLine();
		
		StringBuilder result = new StringBuilder();
		
		String[] stringArr = str.split(" ");
		
		for(String word: stringArr) {
			StringBuilder revWord = new StringBuilder(word);
			result.append(revWord.reverse()).append(" ");
			
			
		}
		
		System.out.println("reverse each word ="+result.toString());
		
		
		

	}

}

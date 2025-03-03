package basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonChracters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String st1=sc.nextLine();
		String st2 = sc.nextLine();
		
		Set<Character>set=new HashSet<>();
		
		for(char ch:st1.toCharArray()) {
			set.add(ch);
		}
		
		for(char ch:st2.toCharArray()) {
			if(set.contains(ch)) {
				System.out.println("comman characters are: "+ch);
				set.remove(ch);
				
				
			}
//		StringBuilder sb = new StringBuilder();
//		Set<Character>seen=new HashSet<Character>();
//		
//		for(int i=0;i<st1.length();i++) {
//			char ch=st1.charAt(i);
//			if(st2.contains(Character.toString(ch)) && !seen.contains(ch)){
//                 sb.append(ch);	
//                 seen.add(ch);
//			}
//		}
//		System.out.println("repeated characters are ="+sb.toString());

	}

}
}

package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		
		char[] crr = str.toCharArray();
		Map<Character, Integer>map=new HashMap<Character, Integer>();
		
//		for(int i=0;i<crr.length;i++) {
//			int count=1;
//			    for(int j=i+1;j<crr.length;j++) {
//			    	if(crr[i]==crr[j] && crr[i]!='0') {
//			    		count++;
//			    		crr[j]='0';
//			    	}
//			    }
//			    if(count >1 && crr[i]!='0') {
//			    	System.out.println(str+"contains "+ crr[i]);
//			    	System.out.println("count ="+count);
//			    }
//			    
//			}
		
		for(char ch:crr) {
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer>entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+"AND"+entry.getValue());
			}
		}
		}
		
		
		

	}



package starPattern;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		
		char ch='a';
		for(int line=0;line<4;line++) {
			for(int ask=0;ask<4;ask++) {
				if(line==0 || ask==0 || line==3 || ask==3) {
					System.out.print("* ");
				}else {
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();
		}

	}

}

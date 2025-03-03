package starPattern;

public class Pattern5 {

	public static void main(String[] args) {
		for(int line=1; line<=5;line++) {
			for(int sp=5;sp>line;sp--) {
				System.out.print(" ");
			}
			for(int ask=0;ask<line;ask++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

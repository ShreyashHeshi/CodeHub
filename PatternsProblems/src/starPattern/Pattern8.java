package starPattern;

public class Pattern8 {

	public static void main(String[] args) {
		for(int line=0;line<5;line++) {
			for(int sp=5;sp>line;sp--) {
				System.out.print(" ");
			}
			for(int no=1;no<=line;no++) {
				System.out.print(no+" ");
			}
			System.out.println();
		}

	}

}

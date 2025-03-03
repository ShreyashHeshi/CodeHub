package starPattern;

public class Pattern9 {

	public static void main(String[] args) {
		for(int line=0;line<5;line++) {
			for(int sp=5;sp>line;sp--) {
				System.out.print(" ");
			}
			char chr='a';
			for(char ch=0;ch<line;ch++) {
				System.out.print(chr+" ");
				chr++;
			}
			System.out.println();
		}

	}

}

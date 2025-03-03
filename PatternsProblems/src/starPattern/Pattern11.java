package starPattern;

public class Pattern11 {

	public static void main(String[] args) {
		for(int line=1;line<=5;line++) {
			for(int sp=5;sp>line;sp--) {
				System.out.print(" ");
			}
			for(int ask=1;ask<=line;ask++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int line=1;line<5;line++)
		{
			for(int sp=0;sp<line;sp++) {
				System.out.print(" ");
			}
			for(int ask=5;ask>line;ask--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

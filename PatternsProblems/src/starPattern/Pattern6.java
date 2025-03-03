package starPattern;

public class Pattern6 {

	public static void main(String[] args) {
		for(int line=0;line<5;line++) {
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

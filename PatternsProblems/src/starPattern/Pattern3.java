package starPattern;

public class Pattern3 {
	public static void main(String[] args) {
		for(int line=5;line>=0;line--) {
			for(int ask=1;ask<=line;ask++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}

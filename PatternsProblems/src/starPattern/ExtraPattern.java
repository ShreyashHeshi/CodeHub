package starPattern;

public class ExtraPattern {

	public static void main(String[] args) {
		for(int line=0;line<6;line++) {
			char ch='a';
			for(int chr=0;chr<line;chr++) {
				System.out.print(ch+" ");
				ch++;
				
			}
			System.out.println();
		}

	}

}

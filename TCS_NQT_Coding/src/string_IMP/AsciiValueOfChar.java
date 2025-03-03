package string_IMP;

public class AsciiValueOfChar {

	public static void main(String[] args) {
		
		char ch= 'A';
		System.out.println(getAscii(ch));

	}

	private static int getAscii(char ch) {
		return (int)ch;
	}

}

package string_IMP;

public class RemoveAllFromString {

	public static void main(String[] args) {
		
		String str="Hello World";
		
		System.out.println("string after removing vowels = "+removeVowels(str));

	}

	private static String removeVowels(String str) {
		
		str = str.replaceAll("[AEIOUaeiou]", "");
		return str;
	}

}

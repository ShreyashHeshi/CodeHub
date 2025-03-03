package string_IMP;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
		String str = "Hello World";
		
		System.out.println("String after remove spaces = "+removeSpaces(str));

	}

	private static String removeSpaces(String str) {
		str = str.replaceAll("\\s", "");
				
		return str;
	}

}

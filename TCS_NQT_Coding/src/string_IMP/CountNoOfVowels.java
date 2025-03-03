package string_IMP;

public class CountNoOfVowels {

	public static void main(String[] args) {
		String str="Hello World";
		countChars(str);

	}

	private static void countChars(String str) {
		int vowels=0;
		int consonants=0;
		int space=0;
		
		str=str.toLowerCase();
		for(char ch:str.toCharArray()) {
			if(ch==' ') {
				space++;
			}else if(ch>= 'a' && ch<= 'z') {
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowels++;
				}else {
					consonants++;
				}
			}
		}
		
		System.out.println("space count ="+space);
		System.out.println("vowels count ="+ vowels);
		System.out.println("consonenets count ="+consonants);
		
		
	}

}

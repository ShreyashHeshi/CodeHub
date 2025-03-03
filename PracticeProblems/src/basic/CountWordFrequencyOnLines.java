package basic;

public class CountWordFrequencyOnLines {

	public static void main(String[] args) {
		
		String input = "shreyash heshi\n"+
		               "heshi\n"+
				       "shreyash heshi shreyash";
		
		String[] lines = input.split("\\n");
		
		for(int i=0; i<lines.length;i++) {
			int shreyashCount = countOccur(lines[i], "shreyash");
			int heshiOccur = countOccur(lines[i], "heshi");
			
			System.out.println("on line"+ (i+1)+ "shreyash count ="+ shreyashCount+ "and heshi count ="+ heshiOccur);
		}

	}

	private static int countOccur(String line, String word) {
		String[] words = line.split(" ");
		int count=0;
		for(String str:words) {
			if(str.equals(word)) {
				count++;
			}
		}
		return count;
		
	}

}

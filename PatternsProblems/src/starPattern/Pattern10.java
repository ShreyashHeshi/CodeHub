package starPattern;

public class Pattern10 {

	public static void main(String[] args) {
		
		for(int line=1;line<=5;line++) {
			for(int sp=5;sp>=line;sp--) {
				System.out.print(" ");
			}
			char ch='a';
			int no=1;
			for(int chr=1;chr<=line;chr++) {
				if(line%2==0) {
					System.out.print(ch+" ");
					ch++;
				}else {
					System.out.print(no+" ");
					no++;
				}
			}
			System.out.println();
		}

	}

}


//public class Pattern10 {
//    public static void main(String[] args) {
//        for (int line = 0; line < 5; line++) {
//            // Print spaces, decreasing with each line
//            for (int sp = 5 - line; sp > 0; sp--) {
//                System.out.print(" ");
//            }
//            
//            // Initialize character and number variables
//            char ch = 'a';
//            int no = 0;
//            
//            // Print numbers or characters based on even or odd line number
//            for (int chr = 0; chr <= line; chr++) {
//                if (line % 2 == 0) {
//                    System.out.print(no + " ");
//                    no++;
//                } else {
//                    System.out.print(ch + " ");
//                    ch++;
//                }
//            }
//            System.out.println();
//        }
//    }
//}
//

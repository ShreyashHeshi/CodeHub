package starPattern;

public class Pattern7 {

	public static void main(String[] args) {
//		for(int line=0;line<5;line++) {
//			if(line==0 || line==4) {
//				for(int ask=0;ask<5;ask++) {
//					System.out.print("*");
//				}
//			}else {
//				for(int ask=0;ask<5;ask++) {
//					if(ask==0 || ask==4) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//			
//			}
//			System.out.println();
//		}
		
		
		for(int line=0;line<5;line++) {
			for(int ask=0;ask<5;ask++) {
				if(line==0 || line==4 || ask==0 || ask==4 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}

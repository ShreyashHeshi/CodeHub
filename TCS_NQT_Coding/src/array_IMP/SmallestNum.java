package array_IMP;

public class SmallestNum {

	public static void main(String[] args) {
		int[] arr = {34,22,1,98,45,0};
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("smallest num= "+ min);

	}

}

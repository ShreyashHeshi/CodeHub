package prescient;

public class SubArrayHavingSum {

	public static void main(String[] args) {
		int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
		int target=17;
		//int[] result = findSum(arr,target);
//		for(int i=0;i<result.length;i++) {
//			System.out.println("subarray ="+result[i]);
//		}
		
		int ans=findSum(arr, target);
		System.out.println("ans = "+ans);

	}
	
	public static int findSum(int[] arr, int target) {
		int start=0;
		int curSum=0;
		int max=0;
		for(int end=0;end<arr.length;end++) {
			curSum+=arr[end];
			
			while(curSum>target && start<end) {
				curSum-=arr[start];
				start++;
			}
			
			if(curSum==target) {
//				int[] subArr= new int[end-start+1];
//				for(int i=0;i<subArr.length;i++) {
//					subArr[i]=arr[start+i];
//				}
//				return subArr;
				max=Math.max(max,end-start+1);
				return max;
			}
			
		}
		//return new int[0];
		return -1;
		
	}

}

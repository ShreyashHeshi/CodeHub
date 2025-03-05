package array;

import java.util.Arrays;

public class RemoveElemnet {

	public static void main(String[] args) {
		
		 int[] nums = {3, 2, 2, 3};
	        int val = 3;

	        
	        int k =removeElement(nums, val);

	        // Print the output
	        System.out.println("Output: " + k);
	        System.out.println("Modified nums: " + Arrays.toString(Arrays.copyOf(nums, k)));

	}
	
	 public static int removeElement(int[] nums, int val) {
	        int i=0;
	        for(int j=0;j<nums.length;j++){
	            if(nums[j]!=val){
	                nums[i]=nums[j];
	                i++;
	            }
	        }
	        return i;
	        
	        // time = O(n)
	        // space = O(1)

	        
	    }

}

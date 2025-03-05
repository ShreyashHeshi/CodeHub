package array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		
		 int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};  // Example input (sorted array)
	        
	        
	        int k = removeDuplicates(nums); // Calling the method
	        
	        // Print output
	        System.out.println("Output: " + k);
	        System.out.println("Modified nums: " + Arrays.toString(Arrays.copyOf(nums, k)));

	}
	
	public static int removeDuplicates(int[] nums) {
        // HashSet<Integer>set = new HashSet<>();
        // int i=0;
        // for(int num:nums){
        //     if(!set.contains(num)){
        //         set.add(num);
        //         nums[i]=num;
        //         i++;
        //     }

        // }   // time = O(n)  space = O(n)
        // return i;  


        // 2nd approach
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }

        }
        return i+1;  // time = O(n)  space = O(1)

   
    }

}

package solution;

import java.util.Arrays;

public class Solution3_1 {

    public int removeDuplicates(int[] nums){

        if (nums.length == 0) return 0;
        
        // Initialize the first pointer for the position of the unique element.
        int i = 0;
        
        // Use the second pointer to explore the array.
        for (int j = 1; j < nums.length; j++) {
            System.out.println("nums[i]: " + i + " nums[j]: " + j + " " + Arrays.toString(nums)); 
            // If current element is not equal to the previous one, it's a unique element.
            if (nums[j] != nums[i]) {
                // Move i forward and update the element at position i with the new unique element.
                i++;
                nums[i] = nums[j];
            } 
        }
        
        // Return the count of unique elements. Since i is zero-based index, add 1 for the correct count.
        return i + 1;
    }

    public static void main(String[] args){

        Solution3_1 solution = new Solution3_1(); 

        int[] nums = {0,0,1,1,1,2,2,3,3,4}; 

        System.out.println(solution.removeDuplicates(nums)); 
    }
    
}

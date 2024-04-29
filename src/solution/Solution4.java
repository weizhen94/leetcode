package solution;

import java.util.Arrays;

// Write a function:
// class Solution { public int solution(int[] A); }
// that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
// For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
// Given A = [1, 2, 3], the function should return 4.
// Given A = [−1, −3], the function should return 1.
// Write an efficient algorithm for the following assumptions:
// N is an integer within the range [1..100,000];
// each element of array A is an integer within the range [−1,000,000..1,000,000].

public class Solution4 {

    public int solution(int[] A){

        Arrays.sort(A); 

        int k = 0; 

        for (int i = 1; i <= A.length + 1; i++){

            if (Arrays.binarySearch(A, i) < 0){
                k = i; 
                break; 
            }

        }

        return k; 
    }

    public static void main(String[] args){

        int[] A = {1, 3, 6, 4, 1, 2}; 

        Solution4 solution = new Solution4(); 

        System.out.println(solution.solution(A)); 
        System.out.println(solution.solution(new int[]{-1, -3}));

    }
    
}

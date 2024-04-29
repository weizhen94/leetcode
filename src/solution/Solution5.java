package solution;

import java.util.Arrays;

// An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

// The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

// Write a function:

// class Solution { public int[] solution(int[] A, int K); }

// that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

// For example, given

//     A = [3, 8, 9, 7, 6]
//     K = 3
// the function should return [9, 7, 6, 3, 8]. Three rotations were made:

//     [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
//     [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
//     [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
// For another example, given

//     A = [0, 0, 0]
//     K = 1
// the function should return [0, 0, 0]

// Given

//     A = [1, 2, 3, 4]
//     K = 4
// the function should return [1, 2, 3, 4]

// Assume that:

// N and K are integers within the range [0..100];
// each element of array A is an integer within the range [−1,000..1,000].
// In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

public class Solution5 {

    public int[] solution(int[] A, int K) {

        int length = A.length; 

        int[] B = new int[length]; 

        for (int i = 0; i < length; i++){

            B[i] = (i + K) % length; 

        }

        System.out.println(Arrays.toString(B)); 

        int[] C = new int[length]; 

        for (int j = 0; j < length; j++){

            // C[j] = A[B[j]]; 

            C[B[j]] = A[j]; 
            //A[0] = 3 should go to position C[3] given by C[B[0]], since B[0] = 3
            //A[1] = 8 should go to position C[4] given by C[B[1]], since B[1] = 4
            //A[2] = 9 should go to position C[0] given by C[B[2]], since B[2] = 0
            //A[4] = 7 should go to position C[1] given by C[B[3]], since B[0] = 1
            //A[5] = 6 should go to position C[2] given by C[B[4]], since B[0] = 2
        }

        System.out.println(Arrays.toString(C)); 

        return C;  

    }

    public static void main(String[] args){

        Solution5 solution = new Solution5(); 

        System.out.println(solution.solution(new int[]{3, 8, 9, 7, 6}, 3)); 
        System.out.println(solution.solution(new int[]{0, 0, 0}, 1)); 
        System.out.println(solution.solution(new int[]{1, 2, 3, 4}, 4)); 

    }
    
}

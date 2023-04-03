package com.google.step_definitions.java_codding.array_tasks;

public class Array_LargestSumContiguousSubarray {
    /*
    Largest Sum Contiguous Subarray
    Write a program to find the sum of contiguous subarray within a one-dimensional array of numbers that has the largest sum.

        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.

     */

    public static void main(String[] args) {
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("maxSum(arr) = " + maxSum(arr));
    }

    public static int maxSum(int[] arr) {
        int max = 0, temp = 0;

        for (int each: arr) {
            temp = temp + each;
            temp = Integer.max(temp, 0);
            max = Integer.max(max, temp);
        }

       return max;
    }

}

package com.google.step_definitions.java_codding.leetcode;

import java.util.Arrays;

public class RotateArray {
    /*
    1 Rotate Array in Java
You may have been using Java for a while. Do you think a simple Java array question
can be a challenge? Let’s use the following problem to test.
Problem: Rotate an array of n elements to the right by k steps. For example, with n
= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
How many different ways do you know to solve this problem?
     */

    public static void main(String[] args) {

        System.out.println("rotateArray(7, 3) = " + Arrays.toString(rotateArray(7, 3)));
        System.out.println("Arrays.toString(rotateArrayIll(-1, 3)) = " + Arrays.toString(rotateArrayIll(2, -1)));
        System.out.println("Arrays.toString(rotateArray(0,3)) = " + Arrays.toString(rotateArray(0, 3)));
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        rotate1(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        rotate2(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        rotate2(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);


    }

    static int[] rotateArray(int n, int k) {
        if (n < 0 || k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        int[] arr = new int[n];
        for (int i = k; i < arr.length; i++) {
            arr[i] = i + 1 - k;
        }
        for (int i = 0; i < arr.length; i++) {
            if (k > 0) {
                arr[i] = arr.length + 1 - k;
                k--;
            }
        }
        return arr;
    }

    static int[] rotateArrayIll(int n, int k) {
        try {
            int[] arr = new int[n];
            for (int i = k; i < arr.length; i++) {
                arr[i] = i + 1 - k;
            }
            for (int i = 0; i < arr.length; i++) {
                if (k > 0) {
                    arr[i] = arr.length + 1 - k;
                    k--;
                }
            }
            return arr;
        } catch (RuntimeException e) {
            e.getLocalizedMessage();
            e.printStackTrace();
        }
        return null;
    }

    public static void rotate(int[] nums, int k) {
        if (k > nums.length)
            k = k % nums.length;
        int[] result = new int[nums.length];
        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
        System.out.println("result = " + Arrays.toString(result));
    }

    public static void rotate1(int[] arr, int order) {
        if (arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        for (int i = 0; i < order; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }

    public static void rotate2(int[] arr, int order) {
        order = order % arr.length;
        if (arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
//length of first part
        int a = arr.length - order;
        reverse(arr, 0, a - 1);
        reverse(arr, a, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        System.out.println("arr = " + Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1)
            return;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }


    }
}

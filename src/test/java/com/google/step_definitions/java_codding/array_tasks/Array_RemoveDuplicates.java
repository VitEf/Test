package com.google.step_definitions.java_codding.array_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_RemoveDuplicates {

    /*
    Write a function that can remove the duplicates from an array of integers
     */
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 5, 1, 1, 1};
        System.out.println("removeDuplicates(arr) = " + Arrays.toString(removeDuplicates(arr)));
        System.out.println("removeDuplicates2(arr) = " + Arrays.toString(removeDuplicates2(arr)));
    }

    // solution 1
    public static int[] removeDuplicates(int[] array) {
        return Arrays.stream(array).distinct().toArray();
    }


    //solution 2
    public static int[] removeDuplicates2(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;

    }


}

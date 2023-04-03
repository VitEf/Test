package com.google.step_definitions.java_codding.array_tasks;

public class Array_FirstDuplicatedElement {

    /*
    write a program that can find the first duplicated element from the array
     */

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 5, 1};
        System.out.println("firstDuplicatedElement(arr) = " + firstDuplicatedElement(arr));
    }

    public static int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }

            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }

        }

        return firstDuplicated;

    }


}

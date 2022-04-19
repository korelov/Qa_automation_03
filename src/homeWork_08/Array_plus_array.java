package homeWork_08;

import java.util.Arrays;

//https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
public class Array_plus_array {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        int index = 0;
        int index1 = 0;
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr.length; i++) {
            if (i < arr1.length) {
                arr[i] = arr1[index++];
            } else {
                arr[i] = arr2[index1++];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[]{1, 2, 3, 2}, new int[]{4, 5, 6}));
    }

}

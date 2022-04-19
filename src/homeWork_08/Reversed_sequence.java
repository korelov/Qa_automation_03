package homeWork_08;

import java.util.Arrays;

//https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java
public class Reversed_sequence {
    public static int[] reverse(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n--;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }
}

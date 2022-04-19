package homeWork_08;
//https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java

import java.util.Arrays;

public class Convert_a_string_to_an_array {
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("Robin Singh")));
        System.out.println(Arrays.toString(stringToArray("I love arrays they are my favorite")));
    }
}

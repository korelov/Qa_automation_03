package homeWork_08;

// https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java

import java.util.Arrays;

public class Abbreviate_a_Two_Word_Name {

    public static String abbrevName(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            if (i == 0) {
                stringBuilder.append(name.charAt(i)).append('.');
            }
            if (name.charAt(i) == ' ') {
                stringBuilder.append(name.charAt(i + 1));
            }
        }
        return stringBuilder.toString().toUpperCase();
    }

    public static String abbrevName1(String name) {
        String[] res = name.split(" ");
        return res[0].toUpperCase().charAt(0) + "." + res[1].toUpperCase().charAt(0);
    }


    public static void main(String[] args) {
        System.out.println(abbrevName("patrick feeney"));
        System.out.println(abbrevName1("patrick feeney"));

        System.out.println(abbrevName("Sam Harris"));
        System.out.println(abbrevName1("Sam Harris"));
    }
}

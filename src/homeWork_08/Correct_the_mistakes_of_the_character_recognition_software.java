package homeWork_08;
//https://www.codewars.com/kata/577bd026df78c19bca0002c0/train/java

public class Correct_the_mistakes_of_the_character_recognition_software {
    public static String correct(String string) {
        return string.replace('5', 'S').replace('0', 'O').replace('1', 'I');
    }

    public static void main(String[] args) {
        System.out.println(correct("R0BERT MERLE - THE DAY 0F THE D0LPH1N"));
    }
}

package homeWork_08;

// https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java

public class Convert_boolean_values_to_strings {
    public static String boolToWord(boolean b) {
        if (b) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {

        System.out.println(boolToWord(true));
        System.out.println(boolToWord(false));
    }
}

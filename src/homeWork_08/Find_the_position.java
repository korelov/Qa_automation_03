package homeWork_08;

// https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java

public class Find_the_position {

    public static String position(char alphabet) {
        String alphavite = "abcdefghijklmnopqrstuvwxyz";
        int index = 0;
        for (int i = 0; i < alphavite.length(); i++) {
            if (alphavite.charAt(i) == alphabet) {
                index = i + 1;
            }
        }
        return "Position of alphabet: " + index;
    }

    public static void main(String[] args) {
        System.out.println(position('a'));
        System.out.println(position('z'));
    }
}

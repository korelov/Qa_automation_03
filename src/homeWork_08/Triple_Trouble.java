package homeWork_08;
// https://www.codewars.com/kata/5704aea738428f4d30000914/java
public class Triple_Trouble {

    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            res.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(tripleTrouble("this", "test", "lock"));  // ttlheoiscstk
    }
}

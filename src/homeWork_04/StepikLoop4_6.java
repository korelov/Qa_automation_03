package homeWork_04;
/*
На вход подаётся целое число. Выведите его максимальную цифру.

Sample Input:

12345
Sample Output:

5
 */
import java.util.Scanner;


public class StepikLoop4_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char max = 0;
        for (int i = 0; i < a.length();i++) {
            if (max < a.charAt(i)) {
                max = a.charAt(i);
            }
        }
        System.out.println(max);
    }
}

package qa_automation_03.homeWork_04;

import java.util.Scanner;

/*
На вход подаётся натуральное число n. Выведите на печать все его делители в одну строку через пробел.

Sample Input:

15
Sample Output:

1 3 5 15
 */
public class StepikLoop4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <=a ; i++){
            if (a%i==0){
                System.out.print(i + " ");
            }
        }
    }
}

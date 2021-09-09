package homeWork_04;

/*
Напечатайте "лесенку" из чисел от единицы до n, n > 0.

Примечание. Каждая строка в "лесенке" заканчивается цифрой (не пробелом).
 */

import java.util.Scanner;

public class StepikLoop4_2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int b = sc.nextInt();
int b = 6;
        for (int a = 1; a <= b ;a = a + 1 ){
            for (int i = 1 ; i <= a ; i = i + 1) {
                System.out.print( i+ " ");
            }
            System.out.println('\n');
        }
    }
}



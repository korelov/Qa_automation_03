package qa_automation_03.homeWork_04;
/*
Напечатайте "лесенку" из чисел от единицы до n, n > 0.

Примечание. Каждая строка в "лесенке" заканчивается цифрой (не пробелом).

Sample Input:

3
Sample Output:

1
1 2
1 2 3
 */
import java.util.Scanner;

public class StepikLoop4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        String space;
        for (int i = 1; i <= b ;i++ ){
            for (int j = 1 ; j <= i ; j++) {
                space = " ";
                System.out.print(j + space);
                space= "";
            }
            System.out.println('\n');
        }
    }
}
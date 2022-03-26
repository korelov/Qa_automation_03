package qa_automation_03.homeWork_04;
import java.util.Scanner;
/*
На вход подаются числа, которые делятся на 11. Концом последовательности будет любое число,
не делящееся на 11 (это число не входит в последовательность).

Посчитайте количество введённых чисел и сумму тех из них, которые кратны 3.
 */
public class StepikLoop4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 0;
        while (n%11==0) {
            if (n%3==0) {
                sum = sum + n;
            }
            n=sc.nextInt();
            count++;
        }
        i++;
        System.out.println(count);
        System.out.println(sum);
    }
}


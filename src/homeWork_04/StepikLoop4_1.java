package homeWork_04;

import java.util.Scanner;

/*
На вход подаётся последовательность чисел от нуля до 10, являющихся рейтингами фильма,
выставленными зрителями. Если входящее число отрицательное или больше 10, последовательность прерывается.

Посчитайте среднюю оценку фильма.
 */
public class StepikLoop4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double count = 0;
        double i = 0;
        double sum = 0;
        while (i <= 10){
            i = sc.nextInt();
            if (i<0 && i>10) {
                break;
            }
            count++;
            sum = sum + i;
            i++;
        }
        System.out.println(sum/count);
    }
}

package qa_automation_03.homeWork_04;
/*
Задача №2

Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
 */
public class Task2 {
    public static void main(String[] args) {

        int i = 1;
        while (i < 10000) {
            System.out.println(i);
            i *= 5;
        }

        for (int a = 1; a < 10000; a = a*5) {
            System.out.println(a);
        }


    }
}

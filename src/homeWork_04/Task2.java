package homeWork_04;
/*
Задача №2

Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
 */
public class Task2 {
    public static void main(String[] args) {

        int i = 5;
        while (i < 1000) {
            System.out.print(i +" ");
            i *= 5;
        }
    }
}

package qa_automation_03.homeWork_05;

import java.util.Arrays;

/*
Задача №4

Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.

 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0 ; i < array.length; i++ ){
            sum = i + array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива = " + array.length);
        System.out.println("Сумма чисел массива = " + sum);
        System.out.println("Среднее арифметическое всех значений массива = " + (double) sum/ array.length);
    }
}

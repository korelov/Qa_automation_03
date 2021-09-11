package homeWork_05;

import java.util.Arrays;

/*
Задача №2

Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести максимальное значение массива.

 */
public class Task2 {
    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println(Arrays.toString(array));

        int max = array[0];
        for (int i = 0 ; i < array.length ; i++)
            if (max < array[i]) {
                max = array[i];
            }
        System.out.println("Максимальное значение массива = " + max);
    }
}

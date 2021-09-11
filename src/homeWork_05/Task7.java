package homeWork_05;

import java.util.Arrays;

/*
Задача №7

Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве.
 */
public class Task7 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++)
                count ++;
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Количество элементов в массиве =  "+ count);
    }
}

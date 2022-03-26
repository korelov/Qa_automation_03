package qa_automation_03.homeWork_05;

import java.util.Arrays;
/*
Задача №5

Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.
 */
public class Task5 {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int sum =0;
        for (int i = 0; i < array[i].length;i++){
            for (int j = 0 ; j < array[i].length; j++ )
                sum = sum + array[i][j];
        }
        System.out.println("Длина массива = " + array.length);
        System.out.println(Arrays.deepToString(array));
        System.out.println(sum);
    }
}

package qa_automation_03.homeWork_05;

import java.util.Arrays;

/*
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести максимальное значение массива.
 */
public class Task6 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int max = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++)
                if (max < array[i][j] ){
                    max = array[i][j];
                }
        }
        System.out.println("Длина массива = " + array.length );
        System.out.println("Массив  " + Arrays.deepToString(array));
        System.out.println("Максимальное значение массива = " + max);
    }
}

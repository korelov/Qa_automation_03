package homeWork_05;
 /*
         Задача №1

          Дан массив:
          int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
          необходимо вывести сумму всех значений массива.
             */
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println(array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+array[8]);


        // System.out.println(array.length);

        int  sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        System.out.println(sum);
        System.out.println("=================================");
        System.out.println(Arrays.stream(array).sum());
    }
}

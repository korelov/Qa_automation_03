package homeWork_05;

public class Task1 {
    public static void main(String[] args) {
        /*
         Задача №1

          Дан массив:
          int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
          необходимо вывести сумму всех значений массива.
             */
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println(array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+array[8]);


        // System.out.println(array.length);

        int  sum = 0;
        for (int i = 0;  i < array.length;  i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);

    }
}

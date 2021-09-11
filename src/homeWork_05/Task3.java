package homeWork_05;
/*
Задача №3

Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.

 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = array[0];
        int max = array[0];
        for(int i = 0 ; i < array.length; i++)
            if (min > array[i] ){
                min = array[i];
            } else if (max < array[i]) {
                max = array[i];
            }

        System.out.println("Максимальное значение массива = " + max);
        System.out.println("Минимальное значение в массиве = " + min);
    }
}

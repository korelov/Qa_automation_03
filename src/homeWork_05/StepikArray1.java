package homeWork_05;
import java.util.Arrays;
import java.util.Scanner;
/*
На вход подаётся натуральное число n. Создайте массив натуральных чисел от единицы до n включительно и выведите
 его на печать (в одной строке, через пробел).
 */
public class StepikArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i]= i+1;
            System.out.print(arr[i] + " ");
        }
        System.out.println('\n');
        System.out.println(Arrays.toString(arr));
    }
}



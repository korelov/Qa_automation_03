package qa_automation_03.homeWork_05;

import java.util.Arrays;
import java.util.Scanner;

/*
На вход подаётся натуральное число n, затем несколько целых чисел, разделённых пробелом, а на следующей строке - натуральное число k.
Выведите k-е по счёту число по возрастанию. Если такого числа нет, выведите "Ошибка ввода".
 */
public class StepicArray5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int k =  sc.nextInt();
        if (k>n || k < 0) {
            System.out.println("Ошибка ввода");
        } else {
            System.out.println(arr[k-1]);
        }
    }
}


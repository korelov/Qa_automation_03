package qa_automation_03.homeWork_05;
import java.util.Scanner;
/*
На вход подаётся целое число n - длина последовательности, а затем сама последовательность целых чисел.
 Выведите на печать все числа, большие предыдущего числа.
 */
public class StepikArray4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(i > 0 && arr[i] > arr[i - 1]) {
                System.out.print(arr[i]+ " ");
            }
        }
    }
}

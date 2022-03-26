package qa_automation_03.homeWork_05;
import java.util.Scanner;
/*
На вход подаётся натуральное число n > 0, на следующей строке - последовательность целых чисел, а затем - индекс id < n.
 Создайте из неё массив и выведите на печать значение элемента массива c индексом id.
 */
public class StepikArray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0) {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int id = sc.nextInt();
            System.out.println(arr[id]);
        }
    }
}

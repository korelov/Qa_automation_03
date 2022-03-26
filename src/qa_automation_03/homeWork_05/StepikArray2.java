package qa_automation_03.homeWork_05;
import java.util.Scanner;
/*
На вход подаётся натуральное число n > 0 (длина массива), а на следующей строке - последовательность целых чисел.
 Создайте из неё массив и выведите на печать значение последнего элемента массива.
 */
public class StepikArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n>0) {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                //System.out.print(arr[i] + " ");
            }
            System.out.println(arr[n - 1]);
        }


//        System.out.println('\n');
 //       System.out.println(Arrays.toString(arr));
    }
}
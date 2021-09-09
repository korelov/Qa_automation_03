package homeWork_04;
/*
Выведите все нечётные целые числа, находящиеся между введёнными числами (включительно),
в одной строке через пробел, в порядке возрастания.
 */
import java.util.Scanner;

public class StepikLoop4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a<b){
        for (int i = a; i < b ; i = i +1){
            if ((i%2)!=0)
                System.out.print(i + " ");
        }
        } else {
            for (int i = b; i < a ; i = i +1){
                if ((i%2)!=0)
                    System.out.print(i + " ");
            }
        }
    }
}

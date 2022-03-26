package qa_automation_03.homeWork_04;
/*
Вывести следующие строки с соответствующим форматированием (как пирамиды):

Задача №1

0  1  2  3  4  5  6  7  8  9
0  1  2  3  4  5  6  7  8
0  1  2  3  4  5  6  7
0  1  2  3  4  5  6
0  1  2  3  4  5
0  1  2  3  4
0  1  2  3
0  1  2
0  1
0
 */
public class Task4 {
    public static void main(String[] args) {

        int a = 10;
        while (a > 0) {
            for (int i =0; i < a  ; i = i + 1 ) {
                System.out.print(i + " ");
            }
              a=a-1;
            System.out.print('\n');
        }
    }
}
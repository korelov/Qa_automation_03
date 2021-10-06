package homeWork_08;

public class HW_9_10_Part_2 {

    public static void showInfo(int a) {
        System.out.println();
        System.out.println("========= TASK " + a + " ============");
    }

    public static void main(String[] args) {


        showInfo(1);
        //Распечатать последовательность чисел от -100 до 100 включительно,
        // в которой каждое следующее число больше предыдущего на 3
        int a = 1;
        for (int i = (-100); i <= 100; i = i + 3) {
            System.out.print(i + " ");
        }

        //Распечатать последовательность чисел:
        //1, -1, 2, -2, 3, -3, ... -10, 10
        int b = 0;
        for (int i = 1; i <= 10; i++) {
            b = i * (-1);
            System.out.print(i + " " + b + " ");
        }
        System.out.println();

        //Распечатать последовательность чисел:
        //1 5 25 125 625 3125 15625 78125 390625
        for (int i = 1; i <= 390625; i = i * 5) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Распечатать последовательность чисел:
        //1, 10, 100, 1000, 10000, 100000, 1000000
        for (int i = 1; i <= 100_000_0; i = i * 10) {
            System.out.print(i + " ");
        }
        System.out.println();

        showInfo(2);
        //Распечатать с помощью for:
        //1
        //10
        //100
        //1000
        //10000
        //100000
        //1000000

        for (int i = 1; i <= 10000000; i *=10){
            System.out.println(i);
        }
        System.out.println();
        //Распечатать с помощью for:
        //1000000
        //100000
        //10000
        //1000
        //100
        //10
        //1
        for (int i = 1000000 ; i > 0; i/=10 ){
            System.out.println(i);
        }

        //Распечатать с помощью for:
        //1
        //101
        //10101
        //1010101
        //101010101
        int ab= 1;
        for (int i = 1; i <=101010101; i*=100  ){
            ab= i + 1;
            System.out.println(ab);
        }

    }
}


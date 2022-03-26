package qa_automation_03.homeWork_08;

import java.util.Arrays;

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
        showInfo(2);
        //Распечатать последовательность чисел:
        //1, -1, 2, -2, 3, -3, ... -10, 10
        int b = 0;
        for (int i = 1; i <= 10; i++) {
            b = i * (-1);
            System.out.print(i + " " + b + " ");
        }
        System.out.println();
        showInfo(3);
        //Распечатать последовательность чисел:
        //1 5 25 125 625 3125 15625 78125 390625
        for (int i = 1; i <= 390625; i = i * 5) {
            System.out.print(i + " ");
        }
        System.out.println();
        showInfo(4);
        //Распечатать последовательность чисел:
        //1, 10, 100, 1000, 10000, 100000, 1000000
        for (int i = 1; i <= 100_000_0; i = i * 10) {
            System.out.print(i + " ");
        }
        System.out.println();

        showInfo(5);
        //Распечатать с помощью for:
        //1
        //10
        //100
        //1000
        //10000
        //100000
        //1000000

        for (int i = 1; i <= 10000000; i *= 10) {
            System.out.println(i);
        }
        System.out.println();

        showInfo(6);
        //Распечатать с помощью for:
        //1000000
        //100000
        //10000
        //1000
        //100
        //10
        //1
        for (int i = 1000000; i > 0; i /= 10) {
            System.out.println(i);
        }
        showInfo(7);
        //Распечатать с помощью for:
        //1
        //101
        //10101
        //1010101
        //101010101
        int ab = 1;
        for (int i = 1; i <= 101010101; i = i * 100 + 1) {
            System.out.println(i);
        }

        showInfo(8);
        //Написать метод, который принимает на вход 2 целочисленных параметра (a, b) и печатает последовательность
        // положительных  чисел в пределах 1000. Последовательность начинается с числа a, и каждый следующий member
        // последовательности в b раз больше предыдущего.
        //Пример:
        //3, 7   ->   3 21 147
        //5, 3   ->   5 15 45 135 405
        task8(3, 7);


        showInfo(16);
        //Написать метод, который принимает на вход целое положительное число, не больше 10, и возвращает массив
        // double[], который содержит 10 чисел - степени этого числа (Math.pow())

        System.out.println(Arrays.toString(task16(5)));


        showInfo(17);
        //С помощью методов класса Math (догадайтесь по названиям) из массива {-13, 9, -314, -89, 98, 52, -4}:
        //построить новый массив, в котором все числа - положительные
        //построить новый массив, в котором все числа - отрицательные
        System.out.println(Arrays.toString(task17(new int[]{-13, 9, -314, -89, 98, 52, -4})));
        System.out.println(Arrays.toString(task17_1(new int[]{-13, 9, -314, -89, 98, 52, -4})));

        showInfo(18);
        //С помощью методов класса Math построить массив int[] из 10 случайных положительных трехзначных чисел
        // (random numbers). Числа должны быть не больше 1000.
        //Методы: Math.toIntExact(), Math.round(), Math.random()
        System.out.println(Arrays.toString(task18()));


        showInfo(19);
        //С помощью методов класса Math построить новый массив double[], в котором содержится квадратный корень
        // каждого значения массива из задания 18.
        System.out.println(Arrays.toString(task19(task18())));


        showInfo(20);
        //С помощью методов класса Math и смекалки создать массив чисел от 1.11 до 1.99 включительно
        //Методы Math.round(), Math.nextUp()
        int le = (int) Math.round(((1.99 - 1.11) * 100));
        double[] arr1 = new double[le+1];
        int i = 0;
        for (double j = Math.round(1.11 * 100); j <= Math.round(1.99 * 100); j++) {
            arr1[i++] = j / 100;
        }
        System.out.println(Arrays.toString(arr1));

    }

    public static void task8(int a, int b) {
        for (int i = a; i <= 1000; i *= 7) {
            System.out.print(i + " ");
        }
    }

    public static double[] task16(int a) {
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.pow(a, i);
        }
        return arr;
    }

    public static int[] task17(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Math.abs(arr[i]);
        }
        return arr1;
    }

    public static int[] task17_1(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Math.abs(arr[i]) * (-1);
        }
        return arr2;
    }

    public static int[] task18() {
        int[] arr3 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr3[i] = Math.toIntExact((Math.round((Math.random() * 900 + 100))));
        }
        return arr3;
    }

    public static double[] task19(int[] a) {
        double[] arr4 = new double[10];
        for (int i = 0; i < a.length; i++) {
            arr4[i] = Math.sqrt(a[i]);
        }
        return arr4;
    }


}


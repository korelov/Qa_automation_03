package hw8;

import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Utils.showTaskNumber(6);
        System.out.println(Objects.equals(HW8.integer, HW8_1.integer));
        System.out.println(Objects.equals(HW8.string, HW8_1.string));

        Utils.showTaskNumber(7);
        System.out.println(Arrays.toString(HW8.makeArray(2, 2, 3, 4, 6)));

        Utils.showTaskNumber(8);
        System.out.println(Arrays.toString(HW8.makeArray(2.543, 2.234, 3.123, 4543.432, 6.43241)));

        Utils.showTaskNumber(9);
        System.out.println(Arrays.toString(HW8.makeArray("We", "Learn", "Java", "like", "a boss")));

        Utils.showTaskNumber(10);
        System.out.println(Arrays.toString(HW8.multipleArray(HW8.makeArray(2.543, 2.234, 3.123, 4543.432, 6.43241))));

        Utils.showTaskNumber(11);
        System.out.println("Количество четных чисел в массиве " + HW8.evenCount(HW8.makeArray(2, 2, 3, 4, 5)));

        Utils.showTaskNumber(12);
        System.out.println("Количество нечетных чисел в массиве " + HW8.oddCount(HW8.makeArray(2, 2, 3, 4, 5)));

        Utils.showTaskNumber(13);
        System.out.println(Arrays.toString(HW8.more10orNot(HW8.makeArray(23, 2, 3, 44, 6))));

        Utils.showTaskNumber(14);
        System.out.println(HW8.arrToString(HW8.makeArray("We", "Learn", "Java", "like", "a boss")));

        Utils.showTaskNumber(15);
        System.out.println(HW8.sumOfHalf(HW8.makeArray(23, 2, 3, 44, 6)));
        System.out.println(HW8.sumOfHalf(Utils.arr));

        Utils.showTaskNumber(16);
        System.out.println(Arrays.toString(HW8.multipleArray(2)));

        Utils.showTaskNumber(17);
        System.out.println(Arrays.toString(HW8.evenOddArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
        System.out.println(Arrays.toString(HW8.evenOddArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11})));
        System.out.println(Arrays.toString(HW8.evenOddArray(new int[]{0, 1, 33, 3, 4, 5, 6, 7, 8, 9, 10, 11})));

        Utils.showTaskNumber(18);
        System.out.println(Arrays.toString(HW8.randomArray(5)));
        System.out.println(Arrays.toString(HW8.randomArray(43)));
        System.out.println(Arrays.toString(HW8.randomArray(55)));
        System.out.println(Arrays.toString(HW8.randomArray(54)));

        Utils.showTaskNumber(19);
        System.out.println(Arrays.toString(HW8.randomArray(10, 5)));

        Utils.showTaskNumber(20);
        System.out.println(Arrays.toString(HW8.twoDigitNumbers(HW8.randomArray(20))));

        Utils.showTaskNumber(21);
        System.out.println(Arrays.toString(HW8.differenceArray(new int[]{25, 35, 30, 55, 99})));

        Utils.showTaskNumber(22);
        System.out.println(Arrays.deepToString(HW8.phoneNumber(new int[]{1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7})));

        Utils.showTaskNumber(25);
        System.out.println(Arrays.toString(HW8.task25(new int[]{1, 2, 3, 4, 5}, 1, 3)));

        Utils.showTaskNumber(26);
        System.out.println(Arrays.toString(HW8.twoArray(new int[]{1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7},new int[]{1, 2, 3, 4, 5})));

    }
}

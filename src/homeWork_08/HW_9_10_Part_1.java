package homeWork_08;

import java.util.Arrays;

public class HW_9_10_Part_1 {
    public static void showInfo(int a) {
        System.out.println();
        System.out.println("========= TASK " + a + " ============");
    }

    public static void main(String[] args) {

//                Распечатать:
//        числа от 1 до 5
//        числа от 100 до 1
//        числа от 100 до 1 с шагом 10
//        числа от -a до a включительно c шагом 3
//        числа от a до b с шагом с

        showInfo(1);
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 100; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 100; i > 0; i = i - 10) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = -'a'; i < 'a'; i = i + 3) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 'a'; i < 'b'; i = i + 'c') {
            System.out.print(i);
        }

        showInfo(2);
        //Для чисел  от 1 до 100 распечатать только четные числа

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        showInfo(3);
        //Для чисел от 101 до 200 создать массив нечетных чисел

        int count = 0;
        for (int i = 101; i <= 200; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        int mass = 0;
        for (int i = 101; i < 200; i++) {
            if (i % 2 != 0) {
                arr[mass++] = i;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));

        showInfo(4);
//        Для всех чисел от 1 до 10:
//        если число меньше 5, распечатать значение, умноженное на 10,  иначе распечатать значение разделенное на 10
//        Создать массив из получившихся значений

        int le = 0;
        double[] arr2 = new double[10];
        for (int i = 1; i <= 10; i++) {
            if (i <= 5) {
                arr2[le++] = i * 10;
            } else {
                arr2[le++] = i / 10.0;
            }
        }
        System.out.println(Arrays.toString(arr2));

        showInfo(5);
        // Создать массив значений (вычислить эти числа в цикле for) 0.01, 0.02, 0.03, 0.04, 0.05, 600, 700, 800, 900

        int le1 = 0;
        double[] arr3 = new double[9];
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                arr3[le1++] = i / 100.0;
            } else {
                arr3[le1++] = i * 100;
            }
        }
        System.out.println(Arrays.toString(arr3));

        showInfo(6);
        //Создать массив catsColors

        String[] catsColors = new String[8];
        catsColors[0] = " Gray";
        catsColors[1] = " Black";
        catsColors[2] = " Gray";
        catsColors[3] = " Gray";
        catsColors[4] = " Red";
        catsColors[5] = " Gray";
        catsColors[6] = " Red";
        catsColors[7] = " Gray";
        System.out.println(Arrays.toString(catsColors));

        showInfo(7);
        //Создать массив catsAges

        int[] catsAges = new int[]{6, 2, 7, 4, 5, 15, 7, 6};
        System.out.println(Arrays.toString(catsAges));

        showInfo(8);
        //Написать методЫ (столько сколько нужно), которые принимают на вход массив, и печатают (желательно в виде таблички):
        //номер “коробки”
        //значение, которое лежит в этой “коробке”
        //“Накорми кота!”,  если номер коробки равен 4 и цвет рыжий
        //“Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        //ПРоверить работу метода на массивах catsColors и catsAges
        getNumber(catsAges);
        getColor(catsColors);
        catPriv(catsAges);
        catEat(catsColors);
    }

    public static void getNumber(int[] boxNumber) {
        for (int i = 0; i < boxNumber.length; i++) {
            System.out.println(i);
        }
    }

    public static void getColor(String[] colorCat) {
        for (int i = 0; i < colorCat.length; i++) {
            System.out.println(colorCat[i]);
        }
    }

    public static void catEat(String[] catColor) {
        for (int i = 0; i < catColor.length; i++) {
            if (i == 4 && catColor[i].equals(" Red")) {
                System.out.println("Накорми кота!");
            }
        }
    }

    public static void catPriv(int[] catAge) {

        for (int i = 0; i < catAge.length; i++) {
            if (i < 2) {
                System.out.println("Отнеси кота на прививку!" + "из " + i + " коробки");
            }
        }
    }
}


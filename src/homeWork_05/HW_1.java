package homeWork_05;
// https://docs.google.com/document/d/1nBAZxnw0oJO0muZFRsXNsMnAgOFTdNVPJBIpIGWJp1Q/edit
//Задача №1
//
//        Необходимо написать 4 метода:
//        сложение 2х чисел
//        вычитание 2х чисел
//        умножение 2х чисел
//        деление 2х чисел

public class HW_1 {

    int sum(int a, int b) {
        return a + b;
    }

    int subtraction(int a, int b) {
        return a - b;
    }

    int multiplication(int a, int b) {
        return a * b;
    }

    int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        HW_1 hw_1 = new HW_1();
        System.out.println(hw_1.sum(5, 5));
        System.out.println(hw_1.subtraction(5, 250));
        System.out.println(hw_1.multiplication(5, 5));
        System.out.println(hw_1.division(10, 0));
    }
}

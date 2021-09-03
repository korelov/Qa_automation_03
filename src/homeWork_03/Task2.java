package homeWork_03;
/*
Задача №2

Необходимо создать две целочисленные переменные (a, b), присвоить произвольные
 значения переменным на ваш выбор и вывести следующие строки:
maybe a and b are even - если сумма переменных четная
some variable is odd - если сумма переменных нечетная
 */
public class Task2 {

    public static void main(String[] args) {
        int a = 25, b = 65;
        if ((a+b)%2==0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }
    }
}

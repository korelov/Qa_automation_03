package qa_automation_03.homeWork_02;
/*
Задача №1

Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор и вывести
результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление и остаток от деления.
Так же сделать проверку на четность этих переменных и вывести результат.
 */
public class Task1 {
    public static void main(String[] args) {
        int a = 11, b = 20;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println((double) a / b);
        System.out.println(a % b);

        if (a%2==0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }
        //тернаный оператор
        System.out.println(a%2==0?"Число четное":"Число не четное");



        //System.out.println(a%2==0);
        System.out.println(b%2==0);
    }
}
package homeWork_19;

import java.util.ArrayList;
import java.util.List;

//Создать лист со значениями от 100 до 1000.

public class Task2 {

    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 100; i <= 1000; i++) {
            list.add(i);
        }
        System.out.println(list.size());
        System.out.println(list);
    }
}

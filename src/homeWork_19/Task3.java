package homeWork_19;

import java.util.ArrayList;
import java.util.List;

/*Удалить из листа, созданного в предыдущей задаче, все четные элементы.
Попробуйте изменить тип итерационной переменной из цикла, в третьей задаче, на Integer (не int, а Integer) и добиться
 такого же результата, как и с типом int.
 */

public class Task3 {

    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 100; i <= 1000; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }
        System.out.println(list.size());
        System.out.println(list);

        List list1 = new ArrayList();
        for (Integer i = 100; i <= 1000; i++) {
            if (i % 2 != 0) {
                list1.add(i);
            }
        }
        System.out.println(list1.size());
        System.out.println(list1);
    }
}


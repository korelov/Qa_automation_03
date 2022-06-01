package qa_automation_03.homeWork_19;

import java.util.ArrayList;
import java.util.List;

/*Удалить из листа, созданного в предыдущей задаче, все четные элементы.
Попробуйте изменить тип итерационной переменной из цикла, в третьей задаче, на Integer (не int, а Integer) и добиться
 такого же результата, как и с типом int.
 */

public class Task3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 100; i <= 1000; i++) {
            list.add(i);
        }
        System.out.println(list.size());
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println(list.size());
        System.out.println(list);

        for (Integer i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i.intValue());
            }
        }
        System.out.println(list.size());
        System.out.println(list);

    }
}


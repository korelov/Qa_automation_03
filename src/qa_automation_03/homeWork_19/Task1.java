package qa_automation_03.homeWork_19;

import java.util.List;
import java.util.ArrayList;

/*
Создать лист и добавить в него следующие слова:
White.
Tan.
Yellow.
Orange.
Red.
Pink.
Purple.
Blue.
Затем удалить из этого списка все цвета в которых встречается буква “L”
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Tan");
        list.add("Yellow");
        list.add("Orange");
        list.add("Red");
        list.add("Pink");
        list.add("Purple");
        list.add("Blue");
        System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).toLowerCase().contains("l")) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}

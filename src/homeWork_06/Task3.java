package homeWork_06;
/*
Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.
 */
public class Task3 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм".toLowerCase();
        //s = s.toLowerCase();
        //int index = s.indexOf("рит");

        for (int i = 0; i < s.length()-3 ; i++) {
            if (s.substring(i,i+3).equals("рит")){
                System.out.println(i);
            }
        }
        int index = s.indexOf("рит");
        while (index != -1){
            System.out.println(index);
            index = s.indexOf("рит",index +1);
        }

    }
}

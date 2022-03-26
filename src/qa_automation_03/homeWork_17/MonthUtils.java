package qa_automation_03.homeWork_17;

//Статические поля с объектами месяцев должны быть финальными
//Создать статические методы возвращающие кварталы (массивы по 3 месяца соответственно), полугодия и год.
public class MonthUtils {

    public static final Month january = new Month("January ", 31, 15);
    public static final Month february = new Month("February  ", 28, 19);
    public static final Month march = new Month("March ", 31, 22);
    public static final Month april = new Month("April  ", 30, 22);
    public static final Month may = new Month("May  ", 31, 15);
    public static final Month june = new Month("June  ", 30, 21);
    public static final Month july = new Month("July  ", 31, 22);
    public static final Month august = new Month("August  ", 31, 22);
    public static final Month september = new Month("September  ", 30, 22);
    public static final Month october = new Month("October  ", 31, 21);
    public static final Month november = new Month("November  ", 30, 17);
    public static final Month december = new Month("December  ", 31, 22);

    public static final Month[] Q1 = {january, february, march};
    public static final Month[] Q2 = {april, may, june};
    public static final Month[] Q3 = {july, august, september};
    public static final Month[] Q4 = {october, november, december};

    public static final Month[] monthQ(int startM, int endM) {
        Month[] year = {january, february, march, april, may, june, july, august, september, october, november, december};
        int count = Math.abs(startM - endM), countTemp = 0;
        Month[] res = new Month[count + 1];
        for (int i = startM - 1; i <= endM - 1; i++) {
            res[countTemp++] = year[i];
        }
        return res;
    }

}

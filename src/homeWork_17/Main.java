package homeWork_17;


public class Main {

    public static void main(String[] args) {

        //Создаем объект класса Employee
        Employee e1 = new Employee("Maksim", 30, 'M', 30);
        //Вызываем информацию по нашему объекту
        e1.showInfo();
        System.out.print("Зп за выбранные месяца с учетом рабочих дней ");
        System.out.println(e1.getSalary(new Month[]{MonthUtils.january, MonthUtils.february}));

        System.out.println("============");

        System.out.println("Количество рабочих дней в январе " + MonthUtils.january.getWorkDay());

        //Создаем обьект класса Manager
        Manager m1 = new Manager("Anna", 35, 'F', 50);
        //Задаем количество подчиненных
        m1.setNumberOfSubordinates(10);
        //Вызываем информацию переопределенного метода showInfo
        m1.showInfo();
        System.out.println(m1.getSalary(new Month[]{MonthUtils.january, MonthUtils.february,MonthUtils.march}));
        System.out.println("======");
        System.out.println(m1.getSalary(MonthUtils.Q1));
        System.out.println(m1.getSalary(MonthUtils.Q2));
        System.out.println(m1.getSalary(MonthUtils.Q3));
        System.out.println(m1.getSalary(MonthUtils.Q4));

        //вернет зп за выбранный промежуток.
        System.out.println(m1.getSalary(MonthUtils.monthQ(1,3)));

        BaseEmployee m2 = new Manager("maks",28,'M',34);
        m2.showInfo();

    }
}

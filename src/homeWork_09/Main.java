package homeWork_09;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Maksim", 38, 'M');
        Person p2 = new Person("Anna", 35, 'F');
        Employee e1 = new Employee(p1, 550.5);
        Employee e2 = new Employee(p2, 450);

        // System.out.println(e1.person.name);
//        p1.showInfo();
//        p2.showInfo();

        e1.showSalary();


        System.out.println(e1.isSameName(e2));

        Employee[] arr = {e1, e2};
        System.out.println(Salary.getSum(arr));
    }
}

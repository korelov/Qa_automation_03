package homeWork_09;

public class Employee {

    Person person;
    double salary;

    public Employee(Person person, double salary) {
        this.person = person;
        this.salary = salary;
    }

    public boolean isSameName(Employee employee) {
        return person.name.equals(employee.person.name);
    }

    public void showSalary() {
        person.showInfo();
        System.out.println("зарплата: " + salary);
    }
}

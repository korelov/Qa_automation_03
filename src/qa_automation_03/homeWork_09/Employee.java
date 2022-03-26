package qa_automation_03.homeWork_09;

public class Employee {

    static int count;
    
    Person person;
    double salary;

    public Employee(Person person, double salary) {
        this.person = person;
        this.salary = salary;
        count++;
    }

    public boolean isSameName(Employee employee) {
        return person.name.equals(employee.person.name);
    }

    public void showSalary() {
        person.showInfo();
        System.out.println("зарплата: " + salary);
    }
}

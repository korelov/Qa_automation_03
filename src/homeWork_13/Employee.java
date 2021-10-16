package homeWork_13;

public class Employee {

    private String name;
    private int salary;
    private int baseSalary = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void showInfoEmployee(){
        System.out.println("Имя рабочего "+ getName() +"\n" + "Базовая ставка " + getBaseSalary() + "\n" +  "Зарплата " + getSalary());
        System.out.println("=====================");
    }



}



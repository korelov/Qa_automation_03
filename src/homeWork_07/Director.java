package homeWork_07;

public class Director extends Manager {


    public Director(double salary, String name, int numberOfSubordinates) {
        super(salary, name, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + getNumberOfSubordinates() * getBaseSalary() * 9 / 100;
    }
}

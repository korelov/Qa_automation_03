package homeWork_07;

public class Manager extends Worker {

    private int numberOfSubordinates;

    public Manager(double salary, String name, int numberOfSubordinates) {
        super(salary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + numberOfSubordinates * getBaseSalary() * 3 / 100;
    }
}

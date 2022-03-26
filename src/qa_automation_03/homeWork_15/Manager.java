package qa_automation_03.homeWork_15;

public class Manager extends Employee {

    int numberOfSubordinates;

    public Manager(String name, int age, char gender, int salaryDay) {
        super(name, age, gender, salaryDay);
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        return super.getSalary(monthArray) + (super.getSalary(monthArray) / 100 * numberOfSubordinates);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Количество подчиненных " + numberOfSubordinates);
    }
}

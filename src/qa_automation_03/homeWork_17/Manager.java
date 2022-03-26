package qa_automation_03.homeWork_17;

//Классы Employee и Manager должны быть финальными

public final class Manager extends BaseEmployee {

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
        System.out.println("Зп за выбранные месяца или квартал. ");
        return super.getSalary(monthArray) + (super.getSalary(monthArray) / 100 * numberOfSubordinates);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Количество подчиненных " + numberOfSubordinates);
    }
}

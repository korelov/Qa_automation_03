package qa_automation_03.homeWork_13;

public class Manager extends Worker {

    static int countManager;

    Manager(){
        countManager++;
    }

    int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        if (numberOfSubordinates==0) {
            return super.getSalary();
        } else {
            return super.getBaseSalary()*(super.getSalary() + super.getSalary()/100*getNumberOfSubordinates()) ;
        }
    }
}

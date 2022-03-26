package qa_automation_03.homeWork_13;

public class Director extends Manager {

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates()==0) {
            return super.getSalary();
        } else {
            return super.getBaseSalary()*(super.getSalary() + (super.getSalary()/100*getNumberOfSubordinates())*5) ;
        }
    }
}

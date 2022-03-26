package qa_automation_03.homeWork_17;
//Класс Month сделать неизменяемым (immutable)


public class Month {

    private String name;
    private int day;
    private int workDay;

    public Month(String name, int day, int workDay) {
        this.name = name;
        this.day = day;
        this.workDay = workDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }


    public int getWorkDay() {
        return workDay;
    }

}

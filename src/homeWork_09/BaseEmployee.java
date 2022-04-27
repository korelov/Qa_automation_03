package homeWork_09;

//Необходимо создать базовый абстрактный класс BaseEmployee как общего родителя

public abstract class BaseEmployee {
    private String name;
    private int age;
    private char gender;
    private int salaryDay;

    public BaseEmployee(String name, int age, char gender, int salaryDay) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryDay = salaryDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalaryDay() {
        return salaryDay;
    }

    public void setSalaryDay(int salaryDay) {
        this.salaryDay = salaryDay;
    }

    public int getSalary(Month[] monthArray) {
        int res = 0;
        for (int i = 0; i < monthArray.length; i++) {
            res += monthArray[i].getWorkDay();
        }
        return res * getSalaryDay();
    }

    public void showInfo() {
        System.out.println("Имя " + name + "\n" + "Возраст " + age + "\n" + "Пол " + gender + "\n" + "З.п. за день " + salaryDay);
    }


}

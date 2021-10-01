package homeWork_09;

public class Person {

    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        String appeal = "";
        if (gender == 'M') {
            appeal = "Mr ";
        }
        if (gender == 'F') {
            appeal = "Mrs ";
        }
        return appeal + name;
    }

    public void showInfo() {
        System.out.println("Имя: " + getName() + "\n" + "Возраст: " + age + "\n" + "Пол: " + gender);
        System.out.println();

    }
}

package qa_automation_03.homeWork_13;

public class Main {

    public static void main(String[] args) {

        Worker worker1 = new Worker();
        worker1.setName("Ann");
        worker1.setSalary(555);
        Worker worker2 = new Worker();
        worker2.setName("Mike");
        worker2.setSalary(550);

        System.out.println("Количество рабочих " + Worker.count);

        worker1.showInfoEmployee();
        worker2.showInfoEmployee();


        //создаем менеджера
        Manager man1 = new Manager();
        man1.setBaseSalary(1);
        man1.setName("Maksim");
        man1.setSalary(1000);
        man1.setNumberOfSubordinates(Worker.count - Manager.countManager);

        //Manager man2 = new Manager();

        //количество менеджеров
        System.out.println("количество менеджеров " + Manager.countManager);

        man1.showInfoEmployee();

        System.out.println("=======");


        //создаем директора
        Director dir = new Director();
        dir.setName("Vasia");
        dir.setSalary(2000);
        dir.setNumberOfSubordinates(Worker.count);
        dir.showInfoEmployee();


        //общее количество сотрудников включая рабочих, менеджера и директора
        System.out.println("общее количество сотрудников " + Worker.count);

        Worker[] arr1 = {worker1, worker2, man1, dir};


        //System.out.println(Utill.findName("Ann", arr1).getName());
        System.out.println(Utill.sumSalary(arr1));


        //создаем массив из рабочих , менеджеров и директора
        Employee[] arr2 = {worker1, worker2, man1, dir};


        System.out.println(Utill.minSalary(arr2).getSalary());
        System.out.println(Utill.minSalary(arr2).getName());

    }

}

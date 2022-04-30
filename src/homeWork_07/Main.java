package homeWork_07;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker(1000, "Maksim");

        Manager manager = new Manager(1000, "Anna", 11);

        Director director = new Director(1000, "Nikolay", 10);

        System.out.println(Utils.searchName(new Employee[]{worker, manager, director}, "Maksim"));

        System.out.println(Utils.namePartSearch(new Employee[]{worker, manager, director}, "ol"));

        System.out.println(worker.getSalary());
        System.out.println(manager.getSalary());
        System.out.println(director.getSalary());
        System.out.println(Utils.budget(new Employee[]{worker, manager, director}));

        System.out.println(Utils.minSalary(new Employee[]{worker, manager, director}));

        System.out.println(Utils.maxSalary(new Employee[]{worker, manager, director}));

        System.out.println(Utils.maxSubManager(new Manager[]{manager, director}));


    }

}

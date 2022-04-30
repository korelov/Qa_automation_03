package homeWork_07;

public class Utils {

    public static Employee searchName(Employee[] employees, String name) {
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getName())) {
                return employees[i];
            }
        }
        return null;
    }

    public static Employee namePartSearch(Employee[] employees, String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().contains(name)) {
                return employees[i];
            }
        }
        return null;
    }

    public static int budget(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public static double minSalary(Employee[] employees) {
        double min = Integer.MAX_VALUE;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    public static double maxSalary(Employee[] employees) {
        double max = Integer.MIN_VALUE;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    public static int minSubManager(Manager[] managers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() < min) {
                min = managers[i].getNumberOfSubordinates();
            }
        }
        return min;
    }

    public static int maxSubManager(Manager[] managers) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() > max) {
                max = managers[i].getNumberOfSubordinates();
            }
        }
        return max;
    }
}

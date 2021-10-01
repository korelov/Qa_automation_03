package homeWork_09;

public class Salary {
    public static double getSum(Employee[] employeeArray) {
        double result = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            result += employeeArray[i].salary;
        }
        return result;
    }
}

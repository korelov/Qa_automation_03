package qa_automation_03.homeWork_13;

public class Utill {

    //поиск сотрудника по имени
    public static Worker findName(String name, Worker[] array) {
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i].getName())) {
                return array[i];
            }
        }
        return null;
    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int sumSalary(Worker[] arr1) {
        int res = 0;
        for (int i = 0; i < arr1.length; i++) {
            res += arr1[i].getSalary();
        }
        return res;
    }


    //поиск минимальной зарплаты
    public static Employee minSalary(Employee[] arr) {

        Employee res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (res.getSalary() > arr[i].getSalary()) {
                res = arr[i];
            }
        }
        return res;
    }


}

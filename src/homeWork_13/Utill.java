package homeWork_13;

public class Utill {

    public static Worker findName( String name, Worker[] array){
        for (int i =0; i < array.length; i++){
            if (name.equals(array[i].getName())){
                return array[i];
            }
        }
        return null;
    }

//подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int sumSalary(Worker[] arr1){
        int res=0;
        for (int i = 0 ; i < arr1.length; i++){
            res += arr1[i].getSalary();
        }
        return res;
    }


}

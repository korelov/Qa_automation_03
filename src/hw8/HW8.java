package hw8;

public class HW8 {

    static Integer integer = 121;
    static Double aDouble = 123.454;
    static String string = "Java";


    public static int[] makeArray(int a, int a1, int a2, int a3, int a4) {
        return new int[]{a, a1, a2, a3, a4};
    }

    public static double[] makeArray(double a, double a1, double a2, double a3, double a4) {
        return new double[]{a, a1, a2, a3, a4};
    }

    public static String[] makeArray(String a, String a1, String a2, String a3, String a4) {
        return new String[]{a, a1, a2, a3, a4};
    }

    public static double[] multipleArray(double[] arr) {

        final double NUMBER = 2.5;
        double[] arr1 = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i] * NUMBER;
        }
        return arr1;
    }

    public static int evenCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int oddCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean[] more10orNot(int[] arr) {
        boolean[] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                arr1[i] = true;
            } else {
                arr1[i] = false;
            }
        }
        return arr1;
    }

    public static String arrToString(String[] arr) {
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i] + " ";
            if (i == arr.length - 1) {
                res += arr[i] + ".";
            }
        }
        return res;
    }

    public static int sumOfHalf(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 >= Math.round(arr.length / 2.0)) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int[] multipleArray(int a) {
        int[] arr = Utils.arr;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * a;
        }
        return arr;
    }

    public static int[] evenOddArray(int[] arr) {
        int even = evenCount(arr);
        int odd = oddCount(arr);
        int length;

        if (even == odd) {
            return arr;
        } else length = Math.max(even, odd);

        int index = 0;
        int[] arr1 = new int[length];

        if (even > odd) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    arr1[index++] = arr[i];
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    arr1[index++] = arr[i];
                }
            }
        }
        return arr1;
    }

    public static int[] randomArray(int lenght) {
        int[] arr = new int[lenght];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (100 - 0) + 0);
        }
        return arr;
    }

    public static int[] randomArray(int length, int count) {

        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * ((Math.pow(10, count) - 1) - Math.pow(10, count - 1)) + Math.pow(10, count - 1));
        }
        return arr;
    }

    public static int[] twoDigitNumbers(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {
                count++;
            }
        }
        int[] arr1 = new int[arr.length - count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 9 && arr[i] < 100) {
                arr1[index++] = arr[i];
            }
        }
        return arr1;
    }

    public static int[] differenceArray(int[] arr) {

        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i] / 10 * 10 - arr[i] % 10;
        }
        return arr1;
    }


    public static String[] phoneNumber(int[] arr) {

        String phone = "";
        String country = "USA";

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                phone += arr[i];
                phone+="(";
            }
            if (i > 0 && i < 3) {
                phone += arr[i];
            }
            if (i==3){
                phone+=arr[i];
                phone+=")";
            }
            if (i > 4) {
                phone += arr[i];
            }
        }

        return new String[]{phone, country};
    }

}

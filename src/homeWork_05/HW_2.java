package homeWork_05;

// https://docs.google.com/document/d/1kfxu0qeNHa6mpAIfcZoZg8azqO140iZmubU3gpWa1lM/edit

public class HW_2 {
    static String line = "\n"+"========================="+"\n";
    public static void main(String[] args) {

        int a = 9;
        while (a >= 0) {
            for (int i = 0; i <= a; i++) {
                System.out.print(i + " ");
            }
            a--;
            System.out.println();
        }
        System.out.println(line);

        int b = 9;
        while (b >= 0){

            for (int i = 9; i > b; i--) {
                System.out.print("  ");
            }
            for (int i = 0; i <= b; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            b--;
        }

        System.out.println(line);
        int c = 9;
        while (c >= 0) {
            for (int j = 9; c < j; j--) {
                System.out.print("  ");
            }
            for (int i = c; i >= 1; i--) {
                System.out.print(i + " ");
            }
            for (int i = 0; i <= c; i++) {
                System.out.print(i + " ");
            }
            c--;
            System.out.println();
        }
    }
}

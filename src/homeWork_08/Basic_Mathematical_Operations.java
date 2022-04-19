package homeWork_08;

public class Basic_Mathematical_Operations {
    public static Integer basicMath(String op, int v1, int v2) {
        int res = 0;
        switch (op) {
            case ("+"):
                res = v1 + v2;
                break;
            case ("-"):
                res = v1 - v2;
                break;
            case ("*"):
                res = v1 * v2;
                break;
            case ("/"):
                res = v1 / v2;
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(basicMath("+", 4, 7));
        System.out.println(basicMath("-", 15, 18));
    }
}

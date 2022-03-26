package qa_automation_03.homeWork_07;
//https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
public class Find_the_smallest_integer_in_the_array {
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i=0; i < args.length; i++ ){
            if ( min > args[i]){
                min=args[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a = new int[]{78,56,232,12,11,43};
        System.out.println(findSmallestInt(a));

        int[] a1 = new int[]{78,56,-2,12,8,-33};
        System.out.println(findSmallestInt(a1));

        int[] a2 = new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE};
        System.out.println(findSmallestInt(a2));
    }
}

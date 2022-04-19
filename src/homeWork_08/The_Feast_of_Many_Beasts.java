package homeWork_08;

public class The_Feast_of_Many_Beasts {

    public static boolean feast(String beast, String dish) {
        String a = beast.charAt(0) + "" + beast.charAt(beast.length() - 1);
        String b = dish.charAt(0) + "" + dish.charAt(dish.length() - 1);
        return a.contains(b);
    }

    public static void main(String[] args) {

        System.out.println(feast("great blue heron", "garlic nann"));
        System.out.println(feast("chickadee", "chocolate cake"));
        System.out.println(feast("brown bear", "bear claw"));
    }
}

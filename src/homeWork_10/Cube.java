package homeWork_10;
//https://www.codewars.com/kata/playing-with-cubes-i/train/java

public class Cube {

    int Side;

    public int getSide() {
        return Side;
    }

    public void setSide(int side) {
        Side = side;
    }

    public static void cubeTest(String[] args) {

        Cube cube1 = new Cube();
        cube1.setSide(4);
        System.out.println(cube1.getSide());
    }
}

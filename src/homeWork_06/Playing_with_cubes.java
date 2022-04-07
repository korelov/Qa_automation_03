package homeWork_06;
// https://www.codewars.com/kata/55c0a79e20be94c91400014b/java

class Cube {

    int Side;

    public int getSide() {
        return Side;
    }

    public void setSide(int side) {
        Side = side;
    }
}

public class Playing_with_cubes {

    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.setSide(5);
        System.out.println(cube.getSide());
    }
}

package task08;

public class Ackermann {

    public static int ackermann(final int x, final int y) {
        if (x == 0) {
            return y + 1;
        }
        if (y == 0) {
            System.out.println("x: " + x + " y: " + y);
            return ackermann(x - 1, 1);
        }
        System.out.println("x: " + x + " y: " + y);
        return ackermann(x - 1, ackermann(x, y - 1));
    }
}

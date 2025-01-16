package task08;

public class Multiply {
    //A = 3
    //B = 5
    public static int multiply(final int a, final int b) {
        if (b == 0) {
            return 0;
        }
        return multiply(a, b - 1) + a;
    }
}

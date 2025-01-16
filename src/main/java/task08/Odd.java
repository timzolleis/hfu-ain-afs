package task08;

public class Odd {
    public static int isOdd(final int num) {
        if (num == 0) {
            return 0;
        }
        return 1 - isOdd(num - 1);
    }
}

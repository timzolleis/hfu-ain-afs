package task08;

public class Difference {

    private static int pred(final int n) {
        if (n == 0) {
            return 0;
        }
        return n - 1;
    }

    //To be fair, I dont know how this would be correctly implemented
    public static int diff(final int m, final int n) {
        if (m <= n) {
            return 0;
        }
        return diff(m - 1, n) + 1;
    }

    //Idea - diff returns distance (or difference) or 0
    //If we add them in reverse order, we always have diff+0 or 0+diff, so we can just add them together and get the difference
    public static int absoluteDifference(final int m, final int n) {
        return diff(m, n) + diff(n, m);
    }


}

//f(m, n)
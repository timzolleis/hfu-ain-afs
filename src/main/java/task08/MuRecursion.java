package task08;

public class MuRecursion {

    final int task01Normal(final int m, final int n) {
        final int firstResult = Difference.diff(9, Multiply.multiply(m, m));
        final int  secondResult = Difference.diff(Multiply.multiply(n, n), 4);
        return Multiply.multiply(firstResult, secondResult);
    }

    final int task01Mu(final int n) {
        boolean hasResult = false;
        int x0 = 0;
        while (!hasResult) {
       final int result = task01Normal(x0, n);
            if (result == 0) {
                hasResult = true;
            } else {
                x0++;
            }
        }
        return x0;
    }

    final int task01MuVideo(final int m) {
        boolean hasResult = false;
        int x0 = 0;
        while (!hasResult) {
            final int result = task01Normal(m, x0);
            if (result == 0) {
                hasResult = true;
            } else {
                x0++;
            }
        }
        return x0;
    }

    final int task0401(final int m, final int n) {
        final int inner = Difference.absoluteDifference(m, Multiply.multiply(3, n));
        return Multiply.multiply(inner, inner);
    }

    final int task0402(final int m, final int n) {
        //M is 0 for all n <= 3
        //Otherwise, this function does not terminate

        // max(0, y - 3) + x
        // max(0, 3 - 3) + 0 = 0
        // max(0, 4 - 3) + 0 = 1
        return 0;






    }


}
//k = max(m, n)
//m = n

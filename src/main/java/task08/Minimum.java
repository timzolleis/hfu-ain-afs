package task08;

public class Minimum {


    private static int pred(final int n) {
        if (n == 0) {
            return 0;
        }
        return n - 1;
    }

    //We define pred as if n > 0 --> n - 1, if n = 0 --> 0 so we cannot have negative numbers
    //If we dont have negative numbers, we can use that to calculate the sign because:
    //sign(1) = 0 -1 (from pred) --> (0) +1 = 1
    //sign(2) =(sign(1)) -1 (from pred) +1 = 1 --> we established that sign(1) = 1 so we have 1-1+1 = 1
    //sign(3) = (Sign(2)) -1 (from pred) +1 = 0 --> we established that sign(2) = 1
    //...and so on
    public static int sign(int num) {
        if (num == 0) {
            return 0;
        }
        return pred(sign(num - 1)) + 1;
    }
    //Idea: Get the sign of a number = 0 if number is 0, 1 if number is positive, omit if number is negative
    //So we can get the difference (which is 0 or positive) of the two numbers (m, n) which will be 0 for m <= n
    //After that, we multiply 1 - sign of the difference to handle the case where m > n (because diff(m, n) will be positive), 1 - 1 = 0 so we get 0 * m = 0
    //We need to add n, so we multiply the sign of diff(m, n) with n again, which in this case will be 1 * n = n
    //If we have the case where m <= n, diff(m, n) will be 0, so 1 - 0 = 1, so we get 1 * m = m and sign(0) * n = 0
    public static int getMinimum(int m, int n) {
        return Multiply.multiply(1 - sign(Difference.diff(m, n)), m) + Multiply.multiply(sign(Difference.diff(m, n)), n);
    }
}

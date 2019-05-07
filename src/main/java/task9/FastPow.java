package task9;

public class FastPow {

    public static int binaryFastPow(int number, int degree) {
        if (degree == 0) {
            return 1;
        }
        if (degree % 2 == 1) {
            return binaryFastPow(number, degree - 1) * number;
        } else {
            int res = binaryFastPow(number, degree / 2);
            return res * res;
        }
    }
}

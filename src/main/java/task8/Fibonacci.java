package task8;

public class Fibonacci {

    public static String getFibonacciSequence(int start, int end) {
        int firstFibonacciNumber = 1;
        int secondFibonacciNumber = 1;
        String startSequence = "";
        if (firstFibonacciNumber >= start) {
            startSequence = firstFibonacciNumber + ", " + secondFibonacciNumber + ", ";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int sum;
        while (secondFibonacciNumber <= end) {
            sum = firstFibonacciNumber + secondFibonacciNumber;
            if (sum >= start && sum <= end) {
                stringBuilder.append(sum).append(", ");
            }
            firstFibonacciNumber = secondFibonacciNumber;
            secondFibonacciNumber = sum;
        }
        return startSequence + stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length()).toString();
    }
}

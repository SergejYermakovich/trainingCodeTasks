package euler1to10;

// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
public class Task6 {
    public static void main(String[] args) {
        long sumOfSquares = 0, squareOfSum = 0, sum = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += i * i;
            sum += i;
        }
        squareOfSum = sum * sum;
        System.out.println(squareOfSum - sumOfSquares);
    }
}

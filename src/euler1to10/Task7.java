package euler1to10;

//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

//        What is the 10 001st prime number?
public class Task7 {
    public static void main(String[] args) {
        int number = 2, quantity = 0;

        while (quantity != 10001) {
            if (isPrime(number)) {
                quantity++;
            }
            number++;
        }

        System.out.println("result: " + (number - 1));
    }

    static boolean isPrime(long number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

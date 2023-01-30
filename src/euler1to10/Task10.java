package euler1to10;

// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
// Find the sum of all the primes below two million.

// 142913828922
public class Task10 {
    public static void main(String[] args) {
        long limit = 2000000;
        long result = 0;
        for (long i = 2; i < limit; i++) {
            if (isPrime(i)) {
                result += i;
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println(result);
    }

    static boolean isPrime(long number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

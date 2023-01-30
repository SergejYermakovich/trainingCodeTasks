package euler1to10;
//The prime factors of 13195 are 5, 7, 13 and 29.

//What is the largest prime factor of the number 600851475143 ?
public class Task3 {
    public static void main(String[] args) {
        long number = 600851475143L;
        System.out.println(getLargestPrimeFactorV2(number));
    }

    static boolean isPrime(long number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    static long getLargestPrimeFactor(long number) {
        for (long i = number; i >= 1; i--) {
            if (number % i == 0 && isPrime(i)) {
                return i;
            }
        }
        return 1;
    }

    static long getLargestPrimeFactorV2(long number) {
        long largestPrimeFactor = 2;
        while (largestPrimeFactor < number) {
            if (number % largestPrimeFactor == 0) {
                number = number / largestPrimeFactor;
            } else {
                largestPrimeFactor++;
            }
        }
        return largestPrimeFactor;
    }
}

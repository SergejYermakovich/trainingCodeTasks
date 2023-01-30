package euler1to10;

// A palindromic number reads the same both ways.
// The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.
public class Task4 {
    public static void main(String[] args) {
        long fistExec = System.currentTimeMillis();
        int result = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int number = i * j;
                if (number > result && isPalindrome(number)) result = number;
            }
        }
        System.out.println(result + " with time:" + (System.currentTimeMillis() - fistExec));

        long secondExec = System.currentTimeMillis();
        int result_V2 = 0;
        for (int i = 999; i > 100; i--) {
            for (int j = 999; j > 100; j--) {
                int number = i * j;
                if (number > result_V2 && isPalindrome(number)) {
                    result_V2 = number;
                }
            }
        }

        System.out.println(result_V2 + " with time:" + (System.currentTimeMillis() - secondExec));
    }

    static boolean isPalindrome(int number) {
        String numString = String.valueOf(number);
        return numString.equals(new StringBuilder(numString).reverse().toString());
    }
}

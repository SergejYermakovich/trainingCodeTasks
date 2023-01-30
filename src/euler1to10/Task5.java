package euler1to10;

//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all the numbers from 1 to 20?
public class Task5 {

    public static void main(String[] args) {
        int result = 1;
        boolean flag = true;
        while (flag) {
            result++;
            flag = getSmallestMultiple(result);
        }

        System.out.println("result: " + result);
    }

    static boolean getSmallestMultiple(int number) {
        for (int i = 1; i <= 20; i++) {
            if (number % i != 0) {
                return true;
            }
        }
        return false;
    }
}

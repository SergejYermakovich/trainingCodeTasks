package randomTasks;
public class UniqueNumbers {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 2, 3, 3, 3, 4};

        System.out.println(isNumberUnique(3, array));
    }

    static boolean isNumberUnique(int number, int[] array) {
        int quantity = 0;
        for (int j : array) {
            if (j == number) quantity++;
        }
        return quantity == 1;
    }

//    static boolean isNumberUnique2(int number, int[] array) {
//        Set<Integer> uniqueSet = Arrays.stream(array).boxed().collect(Collectors.toSet());
//    }

}

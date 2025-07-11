public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 4, 7, 1, 9, 2 };
        int index = linearSearch(numbers, 9);
        System.out.println("Index: " + index);
    }
}

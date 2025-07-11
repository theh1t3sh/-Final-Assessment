//Write a Java program to perform a linear search to find a target element in an array of integers. Return the index of the target element if found, otherwise return -1.

public int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;
}

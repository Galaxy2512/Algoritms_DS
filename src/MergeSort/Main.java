package MergeSort;
//merge sort is a divide and conquer algorithm
//it divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves
public class Main {
    public static void main(String[] args) {
        mergeSort(new int[] { 9, 8, 3, 13, 87, 12, 99 });


    }

    private static void merge(int[] left, int[] right, int[] array) {
        int leftLength = left.length;
        int rightLength = right.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }

        }

        while (i < leftLength) {
            array[k++] = left[i++];
        }

        while (j < rightLength) {
            array[k++] = right[j++];
        }

        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);
        }

    }

    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(left, right, array);

    }


}

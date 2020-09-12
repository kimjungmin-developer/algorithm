public class MergeSort {
    public static void mergeSort(int[] array) {
        int size = array.length;
        if (size < 2) {
            return;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[size - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < size; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left);
        mergeSort(right);

        merge(array, left, right, mid, size - mid);
    }

    private static void merge(int[] array, int[] left, int[] right, int leftEnd, int rightEnd) {
        int i = 0, j = 0, k = 0;
        while (i < leftEnd && j < rightEnd) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < leftEnd) {
            array[k++] = left[i++];
        }
        while(j < rightEnd) {
            array[k++] = right[j++];
        }
    }
}

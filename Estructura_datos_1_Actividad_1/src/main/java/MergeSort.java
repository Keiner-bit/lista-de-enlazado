
public class MergeSort {

    static int iteraciones = 0;
    static int swaps = 0;

    public static void main(String[] args) {

        int[] arr = {95,12,87,43,56,23,78,34,67,89,11,90,54,32,76,21,88,44,69,10,
                     5,72,38,91,14,60,27,83,49,2,99,18,65,7,40,73,25,84,51,3,
                     92,16,58,30,79,24,86,41,70,6,97,13,62,35,74,20,81,46,68,1,
                     94,17,55,31,77,22,85,42,71,4,96,15,63,36,75,19,82,47,66,8,
                     93,9,59,33,80,26,89,48,64,50,98,28,61,37,72,29,83,45,57,52};

        long inicio = System.nanoTime();
        mergeSort(arr, 0, arr.length - 1);
        long fin = System.nanoTime();

        System.out.println("Tiempo(ns): " + (fin - inicio));
        System.out.println("Movimientos: " + swaps);
        System.out.println("Iteraciones: " + iteraciones);
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            iteraciones++;
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
            swaps++;
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, left, temp.length);
    }
}

public class QuickSort {

    static int swaps = 0;
    static int iteraciones = 0;

    public static void main(String[] args) {

        int[] arr = {95,12,87,43,56,23,78,34,67,89,11,90,54,32,76,21,88,44,69,10,
                     5,72,38,91,14,60,27,83,49,2,99,18,65,7,40,73,25,84,51,3,
                     92,16,58,30,79,24,86,41,70,6,97,13,62,35,74,20,81,46,68,1,
                     94,17,55,31,77,22,85,42,71,4,96,15,63,36,75,19,82,47,66,8,
                     93,9,59,33,80,26,89,48,64,50,98,28,61,37,72,29,83,45,57,52};

        long inicio = System.nanoTime();
        quickSort(arr, 0, arr.length - 1);
        long fin = System.nanoTime();

        System.out.println("Tiempo(ns): " + (fin - inicio));
        System.out.println("Swaps: " + swaps);
        System.out.println("Iteraciones: " + iteraciones);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            iteraciones++;
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                swaps++;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        swaps++;

        return i + 1;
    }
}
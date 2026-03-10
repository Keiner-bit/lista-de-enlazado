
public class ShellSort {

    public static void main(String[] args) {

        int[] arr = {95,12,87,43,56,23,78,34,67,89,11,90,54,32,76,21,88,44,69,10,
                     5,72,38,91,14,60,27,83,49,2,99,18,65,7,40,73,25,84,51,3,
                     92,16,58,30,79,24,86,41,70,6,97,13,62,35,74,20,81,46,68,1,
                     94,17,55,31,77,22,85,42,71,4,96,15,63,36,75,19,82,47,66,8,
                     93,9,59,33,80,26,89,48,64,50,98,28,61,37,72,29,83,45,57,52};

        long inicio = System.nanoTime();
        int swaps = 0, iteraciones = 0;

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > temp) {
                    iteraciones++;
                    arr[j] = arr[j - gap];
                    swaps++;
                    j -= gap;
                }
                arr[j] = temp;
            }
        }

        long fin = System.nanoTime();
        System.out.println("Tiempo(ns): " + (fin - inicio));
        System.out.println("Swaps: " + swaps);
        System.out.println("Iteraciones: " + iteraciones);
    }
}
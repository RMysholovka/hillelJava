package HomeWork.sortArray;


/**
 * Created by ${Roman} on 18.10.2015.
 */
public class SortArrays {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }


    public static void bubbleSort(int[] arr) {
// Sorting array elements Descending
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = arr.length-1; j > i; j--) {
                if (arr[j] > arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }

}

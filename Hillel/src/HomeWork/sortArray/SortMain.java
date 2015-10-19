package HomeWork.sortArray;

import java.util.*;

/**
 * Created by ${Roman} on 18.10.2015.
 */
public class SortMain {
    public static void main(String[] args) {

        System.out.println(" Random arrey integer: " );
        int[] arr = getIntsArr();
        System.out.print("\n BubbleSort down: ");


        System.out.print("\n");
        SortArrays.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\n SelectionSort up: \n");


        SortArrays.selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

    private static int[] getIntsArr() {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            //array element is assigned a random number between 0 to 99
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        return arr;
    }
}
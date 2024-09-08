package classes;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] array, int left, int right){
        if (left < right){
            int index_pivot = partition(array, left, right);
            quickSort(array, left, index_pivot - 1);
            quickSort(array, index_pivot + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right){
        int pivotIndex = pickPivotIndex(array, left, right);
        int pivotValue = array[pivotIndex];

        swap(array, pivotIndex, left);

        int i = left;

        for (int j = left + 1; j <= right; j++){
            if (array[j] <= pivotValue){
                i+=1;
                swap(array, i, j);
            }
        }

        swap(array, left, i);
        return i;
    }

    private static int pickPivotIndex(int[] array, int left, int right){
        int mid = (left + right) / 2;

        int[] sorted = {array[left], array[mid], array[right]};
        Arrays.sort(sorted);

        if (sorted[1] == array[left]) return left;
        else if (sorted[1] == array[mid]) return mid;
        else return right;
    }

    private static void swap(int[] array, int i, int j){
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}

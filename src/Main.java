import static classes.QuickSort.quickSort;

public class Main {
    public static void main(String[] args) {

        int[] array = {5, 10, 3, 6, 2, 3, 2, 9, 10, 1, 2};
        int left = 0;
        int right = array.length - 1;

        quickSort(array, left, right);

        for (int arrayAux : array){
            System.out.print(arrayAux + ", ");
        }
    }
}
public class Sorting {

    public static void quickSort(String[] array, int low, int high) {

        // make sure array is not empty
        if (array == null || array.length == 0) {
            return;
        }
        if (low < high) {

            int pivot = partition(array, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(array, low, pivot - 1);//Split array into low index --(pivot-1)
            quickSort(array, pivot + 1, high);  //and pivot+1--high index
        }

    }
    // This method will swap two String elements

    public static void swap(String[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static int partition(String[] array, int low, int high) {
        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        int l = low, h = high;
        while (l <= h) {
            while (array[l].compareTo(pivot) < 0) {
                l++;
            }
            while (array[h].compareTo(pivot) > 0) {
                h--;
            }
            if (l <= h) {
                swap(array, l, h);

            }
        }

        return pivot;
    }
}

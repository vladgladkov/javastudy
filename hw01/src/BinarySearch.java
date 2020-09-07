import java.util.Arrays;

public class BinarySearch {

    private final int[] searchedArray;

    public BinarySearch(int[] array) {
        this.searchedArray = array;
        for (int i = 0; i < this.searchedArray.length; i++) {
            this.searchedArray[i] = (int) (Math.random() * (25 - 1) + 1);
        }
    }

    private String toStr() {
        return Arrays.toString(this.searchedArray);
    }

    private void bubbleSort() {
        for (int i = this.searchedArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (this.searchedArray[j] > this.searchedArray[j+1]) {
                    int swap = this.searchedArray[j];
                    this.searchedArray[j] = this.searchedArray[j+1];
                    this.searchedArray[j+1] = swap;
                }
            }
        }
    }

    private int search(int searchElement) {

        int index = -1;
        if (this.searchedArray != null) {
            int low = 0;
            int high = this.searchedArray.length - 1;
            int mid;
            while (low <= high) {
                mid = (low + high) / 2;
                if (searchElement == this.searchedArray[mid]) {
                    index = mid;
                    break;
                } else {
                    if (searchElement > this.searchedArray[mid]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        BinarySearch searchedArray = new BinarySearch(new int[10]);

        String arrayString = searchedArray.toStr();
        System.out.println("Random array:\n" + arrayString);

        searchedArray.bubbleSort();
        arrayString = searchedArray.toStr();
        System.out.println("Sorted array:\n" + arrayString);

        int index = searchedArray.search(10);
        System.out.println("Element index: " + index);

        index = searchedArray.search(22);
        System.out.println("Element index: " + index);
    }
}

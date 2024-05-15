public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {16, 3, 5, 9, 2, 1, 12, 19 , 31, 86, 7};

        int size = arr.length;
        for(int i = size/2 - 1; i >= 0; i--) {
            heapify(i, size, arr);
        }

        heapSort(size, arr);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void heapSort(int size, int[] arr) {
        for (int i=size-1;i>=0;i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(0, i, arr);
        }
    }

    private static void heapify(int index, int size, int[] arr) {

        int left = index * 2 + 1;
        int right = index * 2 + 2;

        int min = index;

        if(left < size && arr[left] < arr[min]) {
            min = left;
        }

        if (right < size && arr[right] < arr[min]) {
            min = right;
        }

        if(min != index) {
            int temp = arr[index];
            arr[index] = arr[min];
            arr[min] = temp;

            heapify(min, size, arr);
        }
    }
}

public class QuickSort {
    public static void main(String[] args) {
        long x = Long.MAX_VALUE;
        long y = Long.MIN_VALUE;

        Long z = (long) (x * y);


        System.out.println(z);


        int[] arr = {1,6,2,7,3,4,5,9,0};
        int k = 5;
        int [] output = new int[2];
        output[0] = Integer.MIN_VALUE;
        output[1] = Integer.MIN_VALUE;

        quicksort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void findPair(int[] arr, int k, int[] output) {

        int low = 0;
        int high = arr.length - 1;

        while(low < high) {
            if(arr[low] + arr[high] == k) {
                output[0] = low;
                output[1] = high;
                return;
            } else if (arr[low] + arr[high] < k) {
                low += 1;
            } else {
                high -= 1;
            }
        }
    }

    private static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = quicksortHelper(arr, low, high);
            quicksort(arr, low, pivot-1);
            quicksort(arr, pivot+1, high);
        }
    }

    private static int quicksortHelper(int[] arr, int low, int high) {

        /*
        start = 3;
        i = 4;

        1,4,3,5,7,9,8,6

         */

        int start = low - 1;

        int pivot = arr[high];

        for(int i=low;i<high;i++) {
            if(arr[i] < pivot) {
                start+=1;
                //swapping
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
            }
        }

        start+=1;
        int temp = arr[high];
        arr[high] = arr[start];
        arr[start] = temp;

        return start;
    }

}
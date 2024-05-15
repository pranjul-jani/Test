import java.util.Arrays;
import java.util.PriorityQueue;

/*
{"a","a","a","d","c","v","a","d","d","c"} highest occurrences of character
a
 */



public class MainFour {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int[] arr = {2,8,10,5,1};

        int max = arr[0];
        int maxTwo = 0;
        for (int num : arr) {
            if(max < num) {
                maxTwo = max;
                max = num;
            }
        }

//        Arrays.stream(arr).filter(x -> ).collect()

        System.out.println(maxTwo);

        int[] count = new int[26];


        char[] nums = {'a','a','a','d','c','v','a','d','d','c'};

        for (char num : nums) {
            count[num - 'a'] += 1;
        }

        int maxCount = 0;
        int maxCountIndex = -1;

        for (int i=0;i<count.length;i++) {
            if (maxCount < count[i]) {
                maxCount = count[i];
                maxCountIndex = i;
            }
        }

        maxCountIndex = maxCountIndex + 'a';
        char out = (char) maxCountIndex;
        System.out.println(out);

        //Factory, Strategy pattern, builder
        // decorator, singleton
    }
}

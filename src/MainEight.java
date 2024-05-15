import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MainEight {

    public static void main(String[] args) {

        Map<Integer, int[]> map = new HashMap<>();

        Map<int[], Integer> map1 = new HashMap<>();

        int[] arr = new int[2];
        map1.put(arr, 5);

        arr[0] = 1;
        arr[1] = 2;

        System.out.println(map1.get(arr));



        map.put(1, new int[]{3, 3});
        map.put(2, new int[]{2, 3});
        map.put(3, new int[]{1, 3});

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            if(map.get(a)[0] == map.get(b)[0]) {
                return map.get(a)[1] - map.get(b)[1];
            }
            return map.get(b)[0] - map.get(a)[0];
        });

        pq.add(1);
        pq.add(2);
        pq.add(3);

        map.put(3, new int[]{3,1});
//
//        int[] temp = map.getOrDefault(3, new int[]{3,1});
//        temp[0] = 3;
//        temp[1] = 1;
//        map.put(3, temp);

        System.out.println(pq.poll());

    }
}

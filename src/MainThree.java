//
//Given N elements, please implement a stack which on every pop operation, removes and returns the maximum frequency element. If there’s a tie in the frequency, then the topmost highest frequency element will be returned.
//
//
//
//Examples:
//push(4)
//push(6)
//push(7)
//push(6)
//push(9)
//push(5)
//push(6)
//push(8)
//push(9)
//
//stack --> (4,6,7,6,9,5,6,8,9)
//
//output :
//pop() --> 6
//pop() --> 9

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

class PQNode {
    int value;
    int lastOccur;

    PQNode(int value, int lastOccur) {
        this.value = value;
        this.lastOccur = lastOccur;
    }


}

public class MainThree {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<PQNode> pq = new PriorityQueue<>((a, b) -> {
            if (map.get(a.value) != map.get(b.value)) {
                return map.get(b.value) - map.get(a.value);
            }
            return b.lastOccur - a.lastOccur;
        });

        //push(4)
//push(6)
//push(7)
//push(6)
//push(9)
//push(5)
//push(6)
//push(8)
//push(9)
        insertInStack(pq, 4, map);
        insertInStack(pq, 6, map);
        insertInStack(pq, 7, map);
        insertInStack(pq, 9, map);
        insertInStack(pq, 5, map);
        insertInStack(pq, 6, map);
        insertInStack(pq, 8, map);
        insertInStack(pq, 9, map);
        insertInStack(pq, 4, map);
        insertInStack(pq, 4, map);
        insertInStack(pq, 4, map);
        insertInStack(pq, 6, map);

        System.out.println(map);



        System.out.println(pq);
        System.out.println(pop(pq, map));
        System.out.println(pop(pq, map));

        insertInStack(pq, 6, map);
        System.out.println(pop(pq, map));
        insertInStack(pq, 5, map);
        insertInStack(pq, 4, map);

//        System.out.println(map);
        System.out.println(pop(pq, map));







    }

    private static void insertInStack(PriorityQueue<PQNode> pq, int value, Map<Integer, Integer> map) {
        int temp = map.getOrDefault(value, 0);
        temp = temp + 1;
        map.put(value, temp);
        pq.add(new PQNode(value, pq.size()+1));
    }

    private static int pop(PriorityQueue<PQNode> pq, Map<Integer, Integer> map) {
        if(pq.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        PQNode temp1 = pq.poll();
        int pop = temp1.value;

        int temp = map.get(pop);
        temp = temp - 1;
        map.put(pop, temp);

        return pop;
    }
}

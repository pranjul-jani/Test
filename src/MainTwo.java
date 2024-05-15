import java.util.HashMap;
import java.util.Map;

/*
11,12,3,4,5,6,7,8,9,10

11, 12
 */
//class Node {
//    int key;
//    int value;
//    Node next;
//    Node prev;
//
//    Node(int key, int value) {
//        this.key = key;
//        this.value = value;
//    }
//}
public class MainTwo {




//    public static void main(String[] args) {


//        int size = 10;
//        Map<Integer, Node> map = new HashMap<>();
//        Node head = new Node(-1, -1);
//        Node tail = new Node(-1, -1);
//
//        head.next = tail;
//        tail.prev = head;
//
//        MainTwo ob = new MainTwo();
//
//        for(int i=0;i<10;i++)
//            ob.insert(i, map, size, head, tail);
//
//
//        System.out.println(map);
//
//        ob.insert(11, map, size, head, tail);
//
//        System.out.println(map);
//
//
//
//
//    }
//
//    private void insert(int value, Map<Integer, Node> map, int size, Node head, Node tail) {
//        if(map.containsKey(value)) {
//            return;
//        } else {
//            if(map.size() < size) {
//                Node current = new Node(value, value);
//
//                // insert the new element at the front
//                Node next = head.next;
//
//                current.next = next;
//                current.prev = head;
//
//                next.prev = current;
//                head.next = current;
//
//                map.put(value, current);
//
//            } else {
//
//                // in case of overflow remove the element from the tail
//                Node prev = tail.prev;
//                Node nextPrev = prev.prev;
//
//                nextPrev.next = tail;
//                tail.prev = nextPrev;
//
//                map.remove(prev.key);
//                prev.next = null;
//                prev.prev = null;
//
//
//                Node current = new Node(value, value);
//                // insert the new element at the front
//                Node next = head.next;
//                current.next = next;
//                current.prev = head;
//
//                next.prev = current;
//                head.next = current;
//
//                map.put(value, current);
//            }
//        }
//    }

}

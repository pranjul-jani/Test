import java.lang.management.ManagementPermission;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainOne {
    public static void main(String[] args) {
        int output = minDeleteToCreatePalindrome("");
        System.out.println(output);
    }

    private static int minDeleteToCreatePalindrome(String s) {

        int[] count = new int[26];
        char[] ch = s.toCharArray();
        int minDeleteLength = s.length() - 1;
        int currentDeleteLength = 0;

        for (char current : ch) {
            count[current - 'a'] += 1;
        }

        if (isPalindrome(count)) {
            return 0;
        }

        for(int i=0;i<ch.length;i++) {
            char current = ch[i];
            count[current - 'a'] -= 1;
            currentDeleteLength += 1;

            if (isPalindrome(count)) {
                minDeleteLength = Math.min(minDeleteLength, currentDeleteLength);
            }
        }

        for (int i=ch.length-1;i>0;i--) {
            char current = ch[i];
            count[current - 'a'] -= 1;
            currentDeleteLength += 1;

            if (isPalindrome(count)) {
                minDeleteLength = Math.min(minDeleteLength, currentDeleteLength);
            }
        }

        return minDeleteLength;

    }

    private static boolean isPalindrome(int[] count) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i=0;i<count.length;i++) {
            if (count[i] > 0) {
                List<Integer> temp = map.getOrDefault(count[i], new ArrayList<>());
                temp.add(i);
                map.put(count[i], temp);
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getKey() != 1) {
                if (entry.getKey() % 2 != 0 && entry.getValue().size() % 2 != 0) {
                    return false;
                }
            } else {
                if (entry.getValue().size() > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}

/*
a
b
b
c

d d e

0 0 0 2 1
a b c d e

a b
b c d d e
a = 0
b = 1
c = 2
d = 3
e = 4

 */
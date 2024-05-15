import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String output = maxSubsequenceOf0And1("11001");
        System.out.println(output);
    }



    private static String maxSubsequenceOf0And1(String s) {

        char[] ch = s.toCharArray();
        Stack<Integer> st = new Stack<>();

        boolean isZeroEncountered = false;
        int displacedOnes = 0;

        for(char current : ch) {
            if (current == '1') {
                if (isZeroEncountered) {
                    st.push(1);
                }
            } else {
                isZeroEncountered = true;
                while(!st.isEmpty() && st.peek() == 1) {
                    displacedOnes += 1;
                    st.pop();
                }
                st.push(0);
            }
        }

        int countOnes = 0;
        while(!st.isEmpty() && st.peek() == 1) {
            st.pop();
            countOnes += 1;
        }

        int count = Math.min(st.size(), countOnes + displacedOnes);

        System.out.println("count " + 2*count);

        StringBuffer br = new StringBuffer();
        for (int i=0;i<2*count;i++) {
            if (i >= count) {
                br.append('1');
            } else {
                br.append('0');
            }
        }

        return br.toString();

    }
}



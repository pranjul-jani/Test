public class CharacterComparator {

//    public static void main(String[] args) {
//        String str1 = "abcdfjgerj";
//        String str2 = "abcdfjger";
//        String result = lostCharNW(str1, str2);
//        System.out.println("Characters not present in the second string: " + result);
//    }
//
//    public static String lostCharNW(String StringSent, String stringRec) {
//        // Array to store the remaining counts of characters from stringRec
//        int[] remainingCounts = new int[256]; // Assuming ASCII characters
//        for (char c : stringRec.toCharArray()) {
//            remainingCounts[c]++;
//        }
//
//        // String builder to store the result
//        StringBuilder result = new StringBuilder();
//
//        // Iterate through StringSent and check if each character is not present in stringRec
//        for (char c : StringSent.toCharArray()) {
//            if (remainingCounts[c] == 0) {
//                result.append(c);
//            } else {
//                remainingCounts[c]--;
//            }
//        }
//
//        return result.toString();
//    }
}

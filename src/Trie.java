import java.util.HashMap;

import static java.nio.file.Files.delete;

public class Trie {

    private class TrieNode {
        HashMap<Character, TrieNode> children;
        boolean endOfWord;

        TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }

    private final TrieNode root;
    public Trie() {
        root = new TrieNode();
    }

    public static void main(String[] args) {
        Trie ob = new Trie();

        //adding words
        ob.addWord("abc");
        ob.addWord("abgl");
        ob.addWord("cdf");
        ob.addWord("abcd");
        ob.addWord("lmn");

        //searching for whole words
//        System.out.println(ob.searchWord("lmn"));
//        System.out.println(ob.searchWord("abc"));
//        System.out.println(ob.searchWord("abcd"));
//        System.out.println(ob.searchWord("abg"));
//        System.out.println(ob.searchWord("lm"));
//        System.out.println(ob.searchWord("abcgh"));
//        System.out.println(ob.searchWord("adf"));

        //search using prefix
//        System.out.println(ob.searchPrefix("abd"));

        //searching for words with a certain prefix

//        System.out.println();

        System.out.println("delete1");
        //delete whole words
        //ob.deleteWord("ab");
        ob.deleteWord("abcd");
        System.out.println(ob.searchWord("abcd"));
        System.out.println(ob.searchWord("abc"));
        System.out.println();
//
//        System.out.println("delete2");
//        ob.deleteWord("abgl");
//        System.out.println(ob.searchWord("abgl"));
//        System.out.println(ob.searchWord("abc"));
//        ob.deleteWord("abc");
//
//
//
//        System.out.println(ob.searchWord("abc"));


    }

    private void addWord(String word) {
        TrieNode current = root;
        for(int i=0;i<word.length();i++) {
            char ch = word.charAt(i);
            if(!current.children.containsKey(ch)) {
                current.children.put(ch, new TrieNode());
            }
            current = current.children.get(ch);
        }
        current.endOfWord = true;
    }

    private boolean searchWord(String word) {
        TrieNode current = root;
        for(int i=0;i<word.length();i++) {
            char ch = word.charAt(i);
            if(!current.children.containsKey(ch)) {
                return false;
            }
            current = current.children.get(ch);
        }
        return current.endOfWord;
    }

    private boolean searchPrefix(String prefix) {
        TrieNode current = root;
        for(int i=0;i<prefix.length();i++) {
            char ch = prefix.charAt(i);
            if(!current.children.containsKey(ch)) {
                return false;
            }
            current = current.children.get(ch);
        }
        return true;
    }

    private boolean deleteWord(String word) {
        return delete(root, word, 0);
    }

    private boolean delete(TrieNode current, String word, int index) {
        if(word.length() == index) {
          if (!current.endOfWord) {
              return false;
          }

          current.endOfWord = false;

          return current.children.isEmpty();

        }
        char ch = word.charAt(index);
        if (!current.children.containsKey(ch)) {
            return false;
        }

        TrieNode next = current.children.get(ch);

        boolean isSafeToDelete = delete(next, word, index+1);

        if (isSafeToDelete) {
            current.children.remove(ch);

            if (current.endOfWord) {
                return false;
            }

            return current.children.isEmpty();
        }

        return false;


    }

}
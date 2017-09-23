package se.kth.ID1020;


public class App {
    public static void main(String[] args) {
        Trie testTrie = new Trie();
        testTrie.put("apple");
        testTrie.put("apple");
        testTrie.put("apple");
        testTrie.put("apple");
        testTrie.put("app");
        testTrie.put("app");
        System.out.println(testTrie.get("apple"));
        System.out.println(testTrie.get("app"));
    }
}

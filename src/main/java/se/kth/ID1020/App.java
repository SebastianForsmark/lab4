package se.kth.ID1020;


public class App {
    public static void main(String[] args) {
        Trie root = new Trie();
        root.put("app");
        root.put("apple");
        root.put("apple");
        root.put("applepie");

        System.out.println("There are 4 words put into the Trie; 'App', 2 'Apple's, and 'ApplePie'");
        System.out.println("count 'app': " + root.count("app"));
        System.out.println("get 'apple': " + root.get("apple"));
        System.out.println("distinct 'apple': " + root.distinct("apple"));

        TrieIterator itr = new TrieIterator(root, "app");
        System.out.println("Iterate past the prefix app: ");
        while (itr.hasNext())
            System.out.println(itr.next().key);


    }
}

package se.kth.ID1020;


public class App {
    public static void main(String[] args) {
        Trie root = new Trie();
        root.put("apple");
        root.put("applepie");
        root.put("applesauce");
        root.put("applep");
/*        System.out.println(root.get("apple"));
        System.out.println(root.get("app"));
        System.out.println(root.get("ap"));
        System.out.println(root.count("app"));
        System.out.println(root.distinct("apple"));*/

        TrieIterator itr = new TrieIterator(root, "apple");

while (itr.hasNext())
        System.out.println(itr.next().key);



    }
}

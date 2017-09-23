package se.kth.ID1020;

public class Trie {
    char key;
    int value;
    Trie[] branch;

    public Trie() {
        this.key = 0;
        this.branch = new Trie[26];
        int value = 0;
    }

    public void put(String key) {
        if ("".equals(key)) {
            this.value++;
            return;
        }
        char currentLetter = key.charAt(0);
        int currentIndex = currentLetter - 'a';

        if (this.branch[currentIndex] == null) {
            this.branch[currentIndex] = new Trie();
        }

        this.branch[currentIndex].put(key.substring(1));
    }
    public int get(String key)
    {
        if ("".equals(key)) {
            return this.value;
        }
        char currentLetter = key.charAt(0);
        int currentIndex = currentLetter - 'a';

        if (this.branch[currentIndex] == null)
        {
            return 0;
        }
        return this.branch[currentIndex].get(key.substring(1));
    }
}

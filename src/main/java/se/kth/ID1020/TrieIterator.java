package se.kth.ID1020;

import java.util.Iterator;
import java.util.Map;

public class TrieIterator implements Iterator<Map.Entry<String, Integer>> {
    public Trie current;
    public String prefix;
    public int numOfVisitedNodes=-1;
    public int nodesToVisit;

    public TrieIterator(Trie start, String prefix) {
        this.current = start;
        this.prefix = prefix;

    }

    public boolean hasNext() {
        Entry next = next();
        nodesToVisit--;
        return next != null;
    }

    public Entry next() {
        return next(current, prefix);
    }

    public Entry next(Trie current, String key) {
        if (key.equals("")) {
            for (int i = 0; i < 256; i++) {
                if (current.branch[i] != null) {
                    numOfVisitedNodes++;
                    if (numOfVisitedNodes==nodesToVisit) {
                        nodesToVisit++;
                        numOfVisitedNodes = -1;
                        return new Entry(Character.toString((char) i), current.branch[i].value);
                    }
                    else{
                        return next(current.branch[i],"");
                    }
                }
            }
            return null;
        }
        int currentLetter = (int) key.charAt(0);
        return next(current.branch[currentLetter],key.substring(1));
    }

    public void remove() {
    }
}

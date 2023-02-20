package Collections.Exo2;

import java.util.Iterator;

public class FiboIterator implements Iterator<Integer> {
    private int current;
    private int next;
    private int max;
    private int rang;

    public FiboIterator(int max) {
        this.current = 0;
        this.next = 1;
        this.max = max;
        this.rang = 0;
    }

    public boolean hasNext() {
        return rang < max;
    }

    public Integer next() {
        int result = current + next;
        current = next;
        next = result;
        rang++;
        return current;
    }
}


package Collections.Exo2;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer> {
    private int max;

    public Fibonacci(int max) {
        this.max = max;
    }

    public Iterator<Integer> iterator() {
        return new FiboIterator(max);
    }
}

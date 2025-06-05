public class Sequence {
    private Object[] objects;  // array of Object
    private int next = 0;

    public Sequence(int size) {
        objects = new Object[size];
    }

    public void add(Object x) {
        if (next < objects.length) {
            objects[next] = x;
            next++;
        }
    }

    // Inner class SSelector implements Selector interface
    private class SSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == next;  // only up to 'next', not objects.length
        }

        public Object current() {
            return objects[i];
        }

        public void next() {
            if (i < next) i++;
        }
    }

    public Selector getSelector() {
        return new SSelector();
    }
}

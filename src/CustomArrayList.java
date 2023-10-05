import inter.CustomArrayListInter;

public class CustomArrayList<E> implements CustomArrayListInter {
    private Object[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int lastIndex;
    private int capacity;

    public CustomArrayList() {
        elements = new Object[capacity = DEFAULT_CAPACITY];
    }

    public CustomArrayList(int initialCapacity) {
        elements = new Object[capacity = initialCapacity];
    }

    public void add(E element) {
        if (lastIndex == capacity) {
            increaseSize();
        }

        elements[lastIndex++] = element;
    }

    public void add(int index, E element) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < lastIndex; i++) {
            if (index < elements.length) {
                elements[index] = element;
            } else {
                increaseSize();
                elements[lastIndex] = element;
                lastIndex++;
            }
        }
    }

    public void increaseSize() {
        Object[] newElements = new Object[capacity = capacity + (capacity/2)];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }
    public E get(int index) {
        capacityChecker(index);
        return (E) elements[index];
    }

    public void capacityChecker(int index) {
        if (index >= elements.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public void remove(int index) {
        capacityChecker(index);
        Object[] newElements = new Object[capacity -= 1];
        for (int i = 0; i < newElements.length; i++) {
            if (index > i) {
                newElements[i] = elements[i];
            } else {
                newElements[i] = elements[i + 1];
            }
        }
        lastIndex--;
        elements = newElements;
    }
    public int length() {
        return lastIndex;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < lastIndex; i++) {
            builder.append(elements[i]);
            if (i < lastIndex - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}

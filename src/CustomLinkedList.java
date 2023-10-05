public class CustomLinkedList<E> {
    private Node<E> head;
    static class Node<E> {
        private E element;
        private Node<E> nextElement;
        public Node(E element) {
            this.element = element;
        }

        public void setNextElement(Node<E> node) {
            this.nextElement = node;
        }
    }

    public CustomLinkedList() {

    }

    public void add(int index, E element) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> newNode = new Node<>(element);
        if (index == 0) {
            newNode.nextElement = head;
            head = newNode;
        } else {
            Node<E> currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.nextElement;
            }
            newNode.nextElement = currentNode.nextElement;
            currentNode.nextElement = newNode;
        }
    }

    public void addFirst(E element) {
        Node<E> node = new Node<>(element);
        node.nextElement = head;
        head = node;
    }

    public E peek() {
        Node<E> node = new Node<>(head.element);
        return node.element;
    }
//    public E pool() {
//        Node<E> node = new Node<>(head.element);
//        node.element = node.nextElement;
//        return node.element;
//    }

//    public int getIndex(int index) {
//        if (index < 0) {
//            throw new IndexOutOfBoundsException();
//        }
//        Node<E> newNode = new Node<>(head.element);
//        for (int i = 0; i < index - 1; i++) {
//            if ()
//        }
//    }
//
//    public void removeIndex(int index) {
//        if (index < 0) {
//            throw new IndexOutOfBoundsException();
//        }
//        Node<E> node = new Node<>(head.element);
//        if (node.element == head.element) {
//
//        }
//    }

    public void add(E element) {
        Node<E> node = new Node<>(element);
        if (head == null) {
            this.head = node;
        } else {
            Node<E> currentNode = head;
            while (currentNode.nextElement != null) {
                currentNode = currentNode.nextElement;
            }
            currentNode.setNextElement(node);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
            builder.append("[");
            Node<E> currentNode = this.head;
            while (currentNode != null) {
                builder.append(currentNode.element);
                currentNode = currentNode.nextElement;
                if (currentNode != null) {
                    builder.append(", ");
                }
            }
            builder.append("]");
        return builder.toString();
    }
}

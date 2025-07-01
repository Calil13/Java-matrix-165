package lesson24;

public class MyLinkedList<T> implements MyList<T>{
    private Node head;
    private int size;

    public class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public void addValue(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        index--;

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }
        size--;
    }

    @Override
    public void get() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
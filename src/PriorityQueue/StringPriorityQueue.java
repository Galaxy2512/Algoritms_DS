package PriorityQueue;



public class StringPriorityQueue {
    public static void main(String[] args) {
        StringPriorityQueue priorityQueue = new StringPriorityQueue(5);

        priorityQueue.enqueue("D");
        priorityQueue.enqueue("B");
        priorityQueue.enqueue("A");
        priorityQueue.enqueue("C");
        priorityQueue.enqueue("E");

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.dequeue());
        }
    }
    private String[] array;
    private int size;

    public StringPriorityQueue(int capacity) {
        array = new String[capacity];
        size = 0;
    }

    public void enqueue(String value) {
        if (size == array.length) {
            throw new IllegalStateException("Queue is full");
        }

        array[size] = value;
        size++;
    }

    public String dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        int indexOfMax = 0;
        for (int i = 1; i < size; i++) {
            if (array[i].compareTo(array[indexOfMax]) > 0) {
                indexOfMax = i;
            }
        }

        String result = array[indexOfMax];
        array[indexOfMax] = array[size - 1];
        size--;

        return result;
    }

    public String peek() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        int indexOfMax = 0;
        for (int i = 1; i < size; i++) {
            if (array[i].compareTo(array[indexOfMax]) > 0) {
                indexOfMax = i;
            }
        }

        return array[indexOfMax];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

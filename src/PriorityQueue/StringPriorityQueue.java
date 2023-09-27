package PriorityQueue;



public class StringPriorityQueue {
    public static void main(String[] args) {
        StringPriorityQueue priorityQueue = new StringPriorityQueue(5); //kreiranje instance prioritetnog reda za pohranu stringova

        priorityQueue.enqueue("Kristina");//dodavanje elemenata u prioritetni red
        priorityQueue.enqueue("Luka");
        priorityQueue.enqueue("Ana");
        priorityQueue.enqueue("Gloria");
        priorityQueue.enqueue("Sepa");

        while (!priorityQueue.isEmpty()) { //ispisivanje elemenata prioritetnog reda
            System.out.println(priorityQueue.dequeue());
        }
    }
    private String[] array; //kreiranje instance stringa
    private int size; //kreiranje instance velicine

    public StringPriorityQueue(int capacity) { //kreiranje konstruktora
        array = new String[capacity]; //kreiranje instance stringa
        size = 0; //kreiranje instance velicine
    }

    public void enqueue(String value) { //dodavanje elemenata u prioritetni red
        if (size == array.length) {
            throw new IllegalStateException("Queue is full");
        }

        array[size] = value;
        size++;
    }
        //uklanjanje elemenata iz prioritetnog reda
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
//ispisivanje elemenata prioritetnog reda
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
        //ispisivanje elemenata prioritetnog reda

        return array[indexOfMax];
    }
//uklanjanje elemenata iz prioritetnog reda
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

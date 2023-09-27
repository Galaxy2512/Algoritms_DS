package DoubleLinkedList;
//doubly linked list je data struktura koja se sastoji od čvorova koji imaju referencu na prethodni i sljedeći čvor
//svaki čvor ima vrijednost i referencu na prethodni i sljedeći čvor
//prvi čvor ima referencu na null za prethodni čvor, a zadnji čvor ima referencu na null za sljedeći čvor
//doubly linked list ima head i tail
//funkcionira tako da se svaki element liste sastoji od vrijednosti i pokazivača na sljedeći element, te pokazivača na prethodni element, na takav način da se
// vrijednost prvog elementa liste sprema u head, a vrijednost drugog elementa liste se sprema u head.next itd.

public class DoubleLL {
    private DoubleLinkedList.Node head;

    public static void main(String[] args) {
        DoubleLL doubleLL = new DoubleLL();

        // Kreiranje instance liste za pohranu cijelih brojeva
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();

        // Dodavanje elemenata u listu
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);

        // Ispisivanje elemenata liste
        System.out.println("Lista: " + linkedList);

        // Uklanjanje elemenata iz liste
        while (!linkedList.isEmpty()) {
            System.out.println("Uklonjeni element: " + linkedList.remove());
        }

        // Dodajte elemente u dvostruku povezanu listu
        doubleLL.addToLinkedList(5);
        doubleLL.addToLinkedList(3);
        doubleLL.addToLinkedList(1);
        doubleLL.addToLinkedList(2);
        doubleLL.addToLinkedList(4);

        // Ispisivanje elemenata dvostruke povezane liste
        doubleLL.printLinkedList();

        // Ispisivanje lokacije elementa u dvostrukoj povezanoj listi
        doubleLL.printLocation(2);
    }

    // Dodavanje elementa u dvostruku povezanu listu
    public void addToLinkedList(int value) {
        DoubleLinkedList.Node newNode = new DoubleLinkedList.Node(value);
        if (head == null) {
            head = newNode;
        } else {
            DoubleLinkedList.Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Ispisivanje elemenata dvostruke povezane liste
    public void printLinkedList() {
        DoubleLinkedList.Node current = head;
        System.out.print("Dvostruka lista: ");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Ispis lokacije elementa u dvostrukoj povezanoj listi
    public void printLocation(int value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == value) {
                System.out.println("Element " + value + " je na lokaciji " + index);
                return;
            }
            current = current.next;
            index++;
        }
        System.out.println("Element " + value + " nije pronađen");
    }
    //ispis hash koda lokacije elementa u dvostrukoj povezanoj listi

}

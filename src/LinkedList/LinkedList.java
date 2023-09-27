package LinkedList;
// Implementacija liste
//Linked list je struktura podataka koja omogućava brzo dodavanje i brisanje elemenata
//funkcionira tako da se svaki element liste sastoji od vrijednosti i pokazivača na sljedeći element
//prvi element liste se zove head, a zadnji element se zove tail
//head pokazuje na prvi element liste, a tail pokazuje na zadnji element liste
//head i tail su null ako je lista prazna
//vrijednost pokazuje na sljedeći element liste, na nacin da se vrijednost prvog elementa liste sprema u head, a vrijednost drugog elementa liste se sprema u head.next itd.
//npr. ako imamo listu 1, 2, 3, 4, 5, head pokazuje na 1, 1.next pokazuje na 2, 2.next pokazuje na 3 itd.
//svaki cvor ima adresu koja pokazuje na sljedeci cvor, cvor a ima adresu cvora b, cvor b ima adresu cvora c itd.

//linked list ima add, remove, get, set, size, isEmpty, clear, contains, indexOf, lastIndexOf, toArray metode
//add dodaje element na kraj liste


public class LinkedList {
    public static void main(String[] args) {
        // Kreiranje instance liste za pohranu cijelih brojeva
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();

        // Dodavanje elemenata u listu
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);

        linkedList.push(6);
        linkedList.pop();
        linkedList.add(1, 7);


        // Ispisivanje elemenata liste
        System.out.println("Lista: " + linkedList);

        // Uklanjanje elemenata iz liste
        while (!linkedList.isEmpty()) {
            System.out.println("Uklonjeni element: " + linkedList.remove());
        }
        //dohvacanje elementa liste
        linkedList.add(5);
    }

    public void add(String s) {

    }
}

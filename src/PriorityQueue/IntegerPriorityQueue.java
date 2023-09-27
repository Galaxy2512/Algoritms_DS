package PriorityQueue;
// Implementacija prioritetnog reda
// Prioritetni red je struktura podataka koja omogućava brzo dodavanje i brisanje elemenata
// Elementi se dodaju prema prioritetu, a u slučaju jednakog prioriteta, dodaju se na kraj reda
//inicijalizira se tako da se stavi tip podatka koji se sprema u red u <> i onda se stavi ime reda, npr. PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();


import java.util.PriorityQueue;

public class IntegerPriorityQueue {
    public static void main(String[] args) {
        // Kreiranje instance prioritetnog reda za pohranu cijelih brojeva
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Dodavanje elemenata u prioritetni red
        priorityQueue.offer(5);
        priorityQueue.offer(3);
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(4);

        // Ispisivanje elemenata prioritetnog reda
        System.out.println("Prioritetni red: " + priorityQueue);

        // Uklanjanje elemenata iz prioritetnog reda
        while (!priorityQueue.isEmpty()) {
            System.out.println("Uklonjeni element: " + priorityQueue.poll());
        }
    }
}

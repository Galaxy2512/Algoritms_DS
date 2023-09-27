package Queue;
//Queue je struktura podataka koja radi po principu FIFO (First In First Out) - prvi unutra, prvi van.
//queue imamo dvije metode: offer i poll
//offer dodaje element na kraj reda
//poll uzima element sa pocetka reda
//peek uzima element sa pocetka reda ali ga ne brise
//queue je interface, a linkedlist je implementacija queuea
//queue se koristi za redove cekanja, npr. red za cekanje na blagajni u trgovini, red za cekanje na ulaz u koncertnu dvoranu itd.
import java.util.LinkedList;
import java.util.Queue;

public class SuperHeroQueue {
    public static void main(String[] args) {
        // Create a queue for superheroes
        Queue<SuperHero> superheroQueue = new LinkedList<>();

        // Adding superheroes to the queue
        superheroQueue.offer(new SuperHero("Spider-Man"));
        superheroQueue.offer(new SuperHero("Iron Man"));
        superheroQueue.offer(new SuperHero("Wonder Woman"));
        superheroQueue.offer(new SuperHero("Thor"));

        // Printing the contents of the queue
        System.out.println("Superhero Queue: " + superheroQueue);

        // Getting the first superhero in the queue
        SuperHero firstSuperhero = superheroQueue.peek();
        System.out.println("First superhero in the queue: " + firstSuperhero.getName());

        // Removing a superhero from the queue
        SuperHero removedSuperhero = superheroQueue.poll();
        System.out.println("Removed superhero: " + removedSuperhero.getName());

        // Printing the updated queue
        System.out.println("Updated superhero queue: " + superheroQueue);

    }
}
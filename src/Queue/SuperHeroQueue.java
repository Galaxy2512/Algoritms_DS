package Queue;

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
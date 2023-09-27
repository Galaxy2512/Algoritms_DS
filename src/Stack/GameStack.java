package Stack;
//Stack je struktura podataka koja radi po principu LIFO (Last In First Out) - zadnji unutra, prvi van.
//stack imamo dvije metode: push i pop
//push dodaje element na vrh stoga
//pop uzima element sa vrha stoga
//peek uzima element sa vrha stoga ali ga ne brise
//stack je interface, a linkedlist je implementacija stacka

import java.util.Stack;

public class GameStack {
    public static void main(String[] args) {
        // Kreiranje instance stoga za pohranu imena igrica (Stringova)
        Stack<String> gameStack = new Stack<>();

        // Dodavanje imena igrica na stog
        gameStack.push("The Legend of Zelda");
        gameStack.push("Super Mario Bros.");
        gameStack.push("Minecraft");
        gameStack.push("Fortnite");
        gameStack.push("Among Us");
        System.out.println("Sadržaj stoga:" + gameStack); // Ispisivanje stoga




        while (!gameStack.isEmpty()) {
            String game = gameStack.pop();
            System.out.println("Igra koja je skinuta sa stoga: " + game);

        }
        System.out.println("Sadržaj stoga nakon skidanja igrica: " + gameStack);
    }
}

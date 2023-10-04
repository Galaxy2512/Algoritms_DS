package ForLoop;

import java.util.Scanner;

public class SumOfEvenNum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { //ako je broj djeljiv sa 2 bez ostatka onda je paran broj i dodaj ga u sumu i ispisi sumu svih parnih brojeva
                sum = sum + i;
                System.out.print(sum + " ");


            }

        }
        System.out.println("Sum of even numbers from 1 to 100 is: " + sum); //ispisi sumu svih parnih brojeva od 1 do 100 odjednom.



    }


}

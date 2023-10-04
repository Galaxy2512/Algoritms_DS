package ForLoop;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Molimo upisite 5 brojeva: ");
        int unos = input.nextInt();
        int pokusaj = 5;
        int min = unos;
        int max = unos;



        for (int i = 1; i < pokusaj; i++) {
            int n = input.nextInt();
            if (n == 0) {
                System.out.println("Pogrešna vrijednost");
                i--; // Smanjivanje broja pokušaja ako je unesen pogrešan broj
            } else {
                if (n < min) {
                    min = n;
                }
                if (n > max) {
                    max = n;
                }
            }
        }

        System.out.println("Min vrijednost je: " + min);
        System.out.println("Max vrijednost je: " + max);

        input.close(); // Zatvaranje Scanner objekta
    }




    }

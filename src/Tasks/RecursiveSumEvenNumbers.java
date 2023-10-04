package Tasks;

import java.util.ArrayList;
import java.util.List;

public class RecursiveSumEvenNumbers {
    public static void main(String[] args) {
        List<Integer> listaBrojeva = new ArrayList<>();
        listaBrojeva.add(1);
        listaBrojeva.add(2);
        listaBrojeva.add(3);
        listaBrojeva.add(4);
        listaBrojeva.add(5);

        int sumaPar = sumEvenNumbers(listaBrojeva, 0); // Poziv rekurzivne funkcije
        System.out.println("Zbroj parnih brojeva: " + sumaPar);
    }

    public static int sumEvenNumbers(List<Integer> lista, int indeks) {
        // Baza rekurzije: Ako smo došli do kraja liste, završi rekurziju
        if (indeks >= lista.size()) {
            return 0;
        }

        // Provjeri je li trenutni broj paran
        int trenutniBroj = lista.get(indeks); // trenutniBroj = 1
        if (trenutniBroj % 2 == 0) { // 1 % 2 == 0
            // Ako je paran, dodaj ga na zbroj i rekurzivno pozovi funkciju za sljedeći element
            return trenutniBroj + sumEvenNumbers(lista, indeks + 1);
        } else {
            // Ako nije paran, samo rekurzivno pozovi funkciju za sljedeći element
            return sumEvenNumbers(lista, indeks + 1);
        }
    }
}

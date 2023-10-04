package Tasks;

import java.util.ArrayList;
import java.util.List;

public class RecursiveSumOddNumbers {
    public static void main(String[] args) {
        List<Integer> listaBrojeva = new ArrayList<>();
        listaBrojeva.add(1);
        listaBrojeva.add(2);
        listaBrojeva.add(3);
        listaBrojeva.add(4);
        listaBrojeva.add(5);

        int sumaNeparnih = sumOddNumbers(listaBrojeva, 0); // Poziv rekurzivne funkcije
        System.out.println("Zbroj neparnih brojeva: " + sumaNeparnih);
    }

    public static int sumOddNumbers(List<Integer> lista, int indeks) {
        // Baza rekurzije: Ako smo došli do kraja liste, završi rekurziju
        if (indeks >= lista.size()) {
            return 0;
        }

        // Provjeri je li trenutni broj neparan
        int trenutniBroj = lista.get(indeks);
        if (trenutniBroj % 2 != 0) {
            // Ako je neparan, dodaj ga na zbroj i rekurzivno pozovi funkciju za sljedeći element
            return trenutniBroj + sumOddNumbers(lista, indeks + 1);
        } else {
            // Ako nije neparan, samo rekurzivno pozovi funkciju za sljedeći element
            return sumOddNumbers(lista, indeks + 1);
        }
    }
}

package Tasks;

import java.util.ArrayList;
import java.util.List;

public class RecursiveStringLengths {
    public static void main(String[] args) {
        List<String> listaStringova = new ArrayList<>();
        listaStringova.add("Jedan");
        listaStringova.add("Dva");
        listaStringova.add("Tri");
        listaStringova.add("Cetiri");

        printLengths(listaStringova, 0); // Poziv rekurzivne funkcije
    }

    public static void printLengths(List<String> lista, int indeks) {
        // Baza rekurzije: Ako smo došli do kraja liste, završi rekurziju
        if (indeks >= lista.size()) {
            return;
        }

        // Ispisi duljinu trenutnog stringa
        String trenutniString = lista.get(indeks);
        int duljina = trenutniString.length();
        System.out.println("Duljina stringa '" + trenutniString + "': " + duljina);

        // Rekurzivno pozovi funkciju za sljedeći element u listi
        printLengths(lista, indeks + 1);
    }
}


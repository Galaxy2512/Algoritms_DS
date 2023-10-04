package Tasks;

import java.util.ArrayList;
import java.util.List;

public class IterativeStringLengths {
    public static void main(String[] args) {
        List<String> listaStringova = new ArrayList<>();
        listaStringova.add("Jedan");
        listaStringova.add("Dva");
        listaStringova.add("Tri");
        listaStringova.add("Cetiri");

        // Iteracija kroz listu stringova i ispisivanje duljina
        for (String string : listaStringova) {
            int duljina = string.length();
            System.out.println("Duljina stringa '" + string + "': " + duljina);
        }
    }
}

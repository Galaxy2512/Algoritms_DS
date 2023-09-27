package LinearSearch;
// Klasa koja implementira algoritam pretraživanja nizom
// Ovaj algoritam pretražuje niz od početka do kraja i vraća indeks prvog, ako postoji, elementa koji je jednak traženom elementu, a ako takav element ne postoji, vraća -1.
//linear search koristimo kada je niz mali, kada je niz sortiran ili kada je niz nesortiran.
//Složenost algoritma je O(n) u najgorem slučaju, gdje je n broj elemenata u nizu.
//Složenost algoritma je O(1) u najboljem slučaju, gdje je traženi element na prvom mjestu u nizu



public class LinearSearch {
    public static int search(int[] array, int target) {
        // Implementacija algoritma pretraživanja ovdje
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Pronađeno na indeksu i
            }
        }
        return -1; // Element nije pronađen
    }
}

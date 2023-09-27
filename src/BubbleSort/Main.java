package BubbleSort;
//Bubble sort je algoritam sortiranja nizom koji radi tako da prolazi kroz niz i uspoređuje susjedne elemente.
//Ako je lijevi element veći od desnog, onda se zamjenjuju, a ako je lijevi element manji od desnog, onda se ne zamjenjuju.
//Složenost algoritma je O(n^2) u najgorem slučaju, gdje je n broj elemenata u nizu.
//koristimo ga kada je niz mali, kada je niz skoro sortiran ili kada je niz nesortiran.
//Bubble sort je efikasniji od selection sorta, ali je manje efikasan od insertion sorta.
//Bubble sort se može implementirati i rekurzivno i iterativno.
//Rekurzivna implementacija je efikasnija.
public class Main {
public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8};
    System.out.println("Unsorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        BubbleSort.sort(array); // Poziv metode za sortiranje


    System.out.println("Sorted array: "
    );
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); // Ispis sortiranog niza

        }

    }
    public static class BubbleSort {
        public static void sort(int[] array) {
            // Implementacija algoritma sortiranja ovdje
            int n = array.length;   //n je broj elemenata u nizu
            for (int i = 0; i < n - 1; i++) {       // prolazimo kroz niz
                for (int j = 0; j < n - i - 1; j++) {  // prolazimo kroz niz
                    if (array[j] > array[j + 1]) { // Ako je lijevi element veći od desnog
                        // Zamjena mjesta
                        int temp = array[j]; // Privremeno spremi trenutni element
                        array[j] = array[j + 1]; // Kopiraj sljedeći element na trenutno mjesto
                        array[j + 1] = temp; // Kopiraj privremeno spremljeni element na sljedeće mjesto
                    }
                }
            }
        }
    }
}

package InsertionSOrt;
//insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands,
//it is efficient for small data sets, but very inefficient for large lists
//it is more efficient in practice than most other simple quadratic algorithms such as selection sort or bubble sort
//it is important to say that it starts from the second element in the array, and compares it with the first element (index 1 with index 0).


public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8};
        System.out.println("Unsorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        insertionSort(array); // Poziv metode za sortiranje
        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); // Ispis sortiranog niza
        }
    }

    public static void insertionSort(int[] array) {
        // Implementacija algoritma sortiranja ovdje
        int n = array.length; //n je broj elemenata u nizu
        for (int i = 1; i < n; i++) { // prolazimo kroz niz
            int key = array[i]; // trenutni element
            int j = i - 1; // prethodni element
            while (j >= 0 && array[j] > key) { // dok je prethodni element veći od trenutnog
                array[j + 1] = array[j]; // prethodni element postaje trenutni element
                j = j - 1; // prethodni element postaje element prije prethodnog elementa
            }
            array[j + 1] = key; // trenutni element postaje prethodni element
        }
    }

}

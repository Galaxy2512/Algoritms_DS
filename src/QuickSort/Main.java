package QuickSort;
//quick sort je algoritam koji radi tako da uzima jedan element iz niza i stavlja ga na svoje mjesto
//taj element se naziva pivot
//nakon toga se svi elementi manji od pivota stavljaju na lijevu stranu, a svi elementi veći od pivota stavljaju se na desnu stranu
//nakon toga se postupak ponavlja za lijevu i desnu stranu
//složenost algoritma je O(n log n) u najgorem slučaju, gdje je n broj elemenata u nizu
//koristimo ga kada je niz velik
//quick sort je efikasniji od bubble sorta, selection sorta i insertion sorta
//quick sort se može implementirati i rekurzivno i iterativno

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8};
        System.out.println("Unsorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        quickSort(array, 0, array.length - 1); // Poziv metode za sortiranje
        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); // Ispis sortiranog niza
        }



    }

    public static void quickSort(int[] array, int left, int right) {
        // Implementacija algoritma sortiranja ovdje
        if (left < right) {
            int pivot = partition(array, left, right);
            quickSort(array, left, pivot - 1); // Sortiraj lijevu stranu
            quickSort(array, pivot + 1, right); // Sortiraj desnu stranu
        }
    }

    private static int partition(int[] array, int left, int right) {
        // Implementacija algoritma particioniranja ovdje
        int pivot = array[right]; // Pivot je zadnji element
        int i = left - 1; // Index manjeg elementa
        for (int j = left; j < right; j++) {
            if (array[j] < pivot) {
                i++;
                // Zamjena mjesta
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Zamjena mjesta
        int temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;
        return i + 1;
    }


}

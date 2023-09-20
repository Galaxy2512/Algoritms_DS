package LinearSearch;

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

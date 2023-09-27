package BinarySearch;
//Binary search je algoritam pretraživanja nizom koji radi samo na sortiranim nizovima.
//Složenost algoritma je O(log n) u najgorem slučaju, gdje je n broj elemenata u nizu.
//Niz se dijeli na pola sve dok se ne pronađe traženi element.
//Ako je niz sortiran, onda se može koristiti binary search.
//Binary search je efikasniji od linear searcha.
//Binary search se može implementirati i rekurzivno i iterativno.
//Rekurzivna implementacija je efikasnija.


public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;
        int result = BinarySearch.search(array, target);
        if (result == -1) {
            System.out.println("Element nije pronađen!");
        } else {
            System.out.println("Element " + target + " je pronađen na indeksu " + result);
        }
    }
    public static class BinarySearch {
        public static int search(int[] array, int target) {
            // Implementacija algoritma pretraživanja ovdje
            int left = 0;
            int right = array.length - 1;
            while (left <= right) {
                int middle = (left + right) / 2;
                if (array[middle] == target) {
                    return middle;
                } else if (array[middle] < target) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
            return -1; // Element nije pronađen
        }
    }
}

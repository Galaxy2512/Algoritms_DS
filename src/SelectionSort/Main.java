package SelectionSort;
//Selection sort je algoritam sortiranja nizom koji radi tako da prolazi kroz niz i traži najmanji element.
//Nakon što pronađe najmanji element, on ga zamjenjuje s prvim elementom u nizu.
//Složenost algoritma je O(n^2) u najgorem slučaju, gdje je n broj elemenata u nizu.
//koristimo ga kada je niz mali, kada je niz skoro sortiran ili kada je niz nesortiran.
//Selection sort je manje efikasan od insertion sorta i bubble sorta.
//Selection sort se može implementirati i rekurzivno i iterativno.
//Rekurzivna implementacija je efikasnija.


public class Main {


        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11};

            // Ispisivanje niza prije sortiranja
            System.out.println("Niz prije sortiranja:");
            printArray(arr);    // Ispis nesortiranog niza

            selectionSort(arr); // Poziv metode za sortiranje

            // Ispisivanje niza nakon sortiranja
            System.out.println("Niz nakon sortiranja:");
            printArray(arr); // Ispis sortiranog niza
        }

        // Metoda za Selection Sort
        public static void selectionSort(int[] arr) {
            int n = arr.length;

            // Iteriramo kroz niz
            for (int i = 0; i < n - 1; i++) {
                // Pretpostavljamo da je trenutni element najmanji
                int minIndex = i;

                // Iteriramo kroz preostali dio niza da pronađemo stvarno najmanji element
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        // Ako je pronađen manji element, ažuriramo indeks najmanjeg elementa
                        minIndex = j;
                    }
                }

                // Zamjena trenutnog elementa s najmanjim elementom
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        // Metoda za ispisivanje niza
        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

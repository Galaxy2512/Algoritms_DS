package Tasks;

public class RecusriveName {


        public static void main(String[] args) {
            printNameFiveTimes("Kristina", 5);
        }

        public static void printNameFiveTimes(String name, int remaining) {
            // Baza rekurzije: Ako je remaining manji ili jednak nuli, završi rekurziju
            if (remaining <= 0) {
                return;
            }

            // Ispisuje ime i rekurzivno poziva funkciju za preostale ponavljanja
            System.out.println(name);
            printNameFiveTimes(name, remaining - 1);
        }
    }

package ForLoop;

public class ListEvenNumTill100 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            } else {
                System.out.println("Not even number");
            }
        }

        System.out.println("-----------------------------");

        for (int i = 100; i >= 1; i--) { //reversed
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println("Not even number");
            }
        }


    }
}


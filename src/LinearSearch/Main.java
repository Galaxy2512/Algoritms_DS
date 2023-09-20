package LinearSearch;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] array = {1, 2, 3, 4, 5};
        int index = LinearSearch.search(array, 3);

        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found");
        }
    }
}

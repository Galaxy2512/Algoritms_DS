package Recursion;
//recursive method is a method that calls itself
//recursive method can be used to solve problems that can be broken down into smaller, repetitive problems


public class Main {
    public static void main(String[] args) {
        recursiveMethod(3);
        factorial();



    }
    // This is an example of a recursive method

    public static void recursiveMethod(int n) {
        if (n < 1) {
            System.out.println("n is less than 1");
        } else {
            recursiveMethod(n - 1);
            System.out.println(n);
        }
    }
    public static void factorial() {
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.printf("Factorial of %d is %d\n", n, factorial);
    }
}

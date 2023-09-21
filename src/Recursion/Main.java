package Recursion;
//recursive method is a method that calls itself
//recursive method can be used to solve problems that can be broken down into smaller, repetitive problems
//recusive method uses stack to store the intermediate values
//stack is a data structure that stores items in a Last-In/First-Out manner
//from bottom to top
//call stack is a stack data structure that stores information about the active subroutines of a computer program
//lifo - last in first out
//stack overflow error - when the stack is full
//base case - the condition when the recursive method stops calling itself

public class Main {
    public static void main(String[] args) {
        recursiveMethod(3);
        factorial(5);
        walk(5);



    }
    //recursive method to walk down a flight of stairs


    private static void walk(int i) {
        if (i < 1) {
            System.out.println("i is less than 1");
        } else {
            walk(i - 1); //recursive case
            System.out.println("walked " + i + " steps");
        }
    }


    public static void recursiveMethod(int n) {
        if (n < 1) {
            System.out.println("n is less than 1");//base case
        } else {
            recursiveMethod(n - 1); //recursive case
            System.out.println(n);
        }
    }
    public static void factorial(int num) {
        if(num < 1) {
            System.out.println("num is less than 1"); //base case
        } else {
            factorial(num - 1); //recursive case
            System.out.println(num);
        }

    }
}

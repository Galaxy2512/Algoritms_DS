package ForLoop;

import java.util.Scanner;

public class SumOfInputDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a  5 numbers: ");
        int input = scanner.nextInt();
        System.out.println("You entered " +  input);
        int sum = 0;

        while(input > 0) {
            int digit = input % 10;
            sum += digit;
            input /= 10;
        }
        System.out.println("Sum of digits: " + sum);







    }
}

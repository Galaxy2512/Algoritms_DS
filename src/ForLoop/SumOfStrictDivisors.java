package ForLoop;

import java.util.Scanner;

public class SumOfStrictDivisors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int n = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= n/2; i++ ){
            if (n % i == 0){
                sum += i;

                System.out.println(sum);
            }
        }
        System.out.println("Sum is: " + sum);


    }
}

package SwitchVar;
// Write a program that switches the values stored in the variables x and y.
// Print the values of x and y before and after the switch.
public class Main {
    public static void main(String[] args) {

        String x = "water";
        String y = "Kool-Aid";
        String temp; // temporary variable

        temp = x; // store x in temp
        x=y; // store y in x
        y=temp; // store temp in y
        //temp is x, and x is y, and y is temp which is x.

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}

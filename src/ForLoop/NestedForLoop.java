package ForLoop;

public class NestedForLoop {
    public static void main(String[] args) {

        int row = 5;
        int colums = 4;
        String symbol = "kristina";

        for(int i = 0; i <= row; i++ ){
            System.out.println();
            for (int j = 0; j <= colums; j ++){
                System.out.print(" "+ symbol);
            }
        }
    }
}

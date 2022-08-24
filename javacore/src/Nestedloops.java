import java.util.Scanner;

public class Nestedloops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int rows = input.nextInt();

        System.out.println("Enter no. of columns: ");
        int cols = input.nextInt();

        System.out.println("Enter symbol to use: ");
        String symbol = input.next();

        for(int i=1;i<=rows;i++){
            System.out.println();// to give a line break after one time run in a loop
            for(int j=1; j<=cols;j++){
                System.out.print(symbol);
            }

        }


    }
}

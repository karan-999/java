import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("-------------Program to swap values using user provided values---------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        int x = input.nextInt();
        System.out.println("Enter the value of Y: ");
        int y = input.nextInt();
        System.out.println("The value of X is: "+x+" and value of Y is: "+y);

        int temp;
        temp=x;
        x=y;
        y=temp;

        System.out.println("Swapped value of X is: "+x);
        System.out.println("Swapped value of Y is: "+y);
//
        System.out.println("Enter your name: ");
        //String name=input.nextLine();// here we will not be able to provide any value and to encounter this
        // we need to call nextLine method once, and then we can use the same scanner object to accept input
        input.nextLine();
        String name=input.nextLine();
        System.out.println("Gracias "+name);

    }
}

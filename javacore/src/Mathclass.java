import java.util.Scanner;

public class Mathclass {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        double z= Math.pow(10,2);
        System.out.println(z);
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the length of base: ");
        double b = inp.nextDouble();
        System.out.println("Enter the length of perpendicular: ");
        double p = inp.nextDouble();
        double h = Math.sqrt((b*b)+(p*p));
        System.out.println("The length of hypotenuse is: "+h);
    }
}

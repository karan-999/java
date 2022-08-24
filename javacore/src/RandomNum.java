import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random randnum = new Random();
        int x = randnum.nextInt(6)+1;
        double y = randnum.nextDouble(10);
        boolean z = randnum.nextBoolean();
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);
    }
}

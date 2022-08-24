public class StarPattern2 {
    public static void main(String[] args) {
//        // L downward triangle
//        int n=5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j < i; j++) {
//                System.out.print("  ");}
//            for (int j = i; j <=n; j++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }
        // Right Downward triangle
//
//        int n=5;
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = i; j <=n; j++) {
//                System.out.print("* ");
//
//            }
//            for (int j = 1; j < i; j++) {
//                System.out.print("  ");}
//            System.out.println();
//        }

        // Right Triangle
//        int n=5;
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <=i; j++) {
//                System.out.print("* ");}
//
//            for (int j = i; j <n; j++) {
//                System.out.print("  ");
//
//            }
//
//            System.out.println();
//        }
// HILL
//        int n=5;
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = n; j>i; j--) {
//                System.out.print("  ");
//
//            }
//
//            for (int j = 1; j<=i; j++) {
//                System.out.print("* ");}
//            for (int j = 1; j<i; j++) {
//                System.out.print("* ");}
//
//
//
//            System.out.println();
//        }
// Pyramid
        int n=5;
        for (int i = 1; i <= n; i++) {

            for (int j =n; j>i; j--) {
                System.out.print(" ");

            }

            for (int j = 1; j<=i; j++) {
                System.out.print(" *");}  // using this space we can get pyramid program

            System.out.println();
        }

    }
}

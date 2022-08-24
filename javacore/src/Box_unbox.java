public class Box_unbox {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+" "+b);

//        Integer x = new Integer(a);// deprecated but it can be used to convert a primitve type
        //                              into its wrapper class i.e. Boxing or Auto-Boxing
        Integer x = 19;// Boxing or autoboxing, converting int to Wrapper class
        System.out.println(x+10);

        int c = x;  // Unboxing converting a class object(reference type) to Primitive type
        System.out.println(x+10);


    }
}

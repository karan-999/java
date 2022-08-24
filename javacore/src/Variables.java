public class Variables {
    static int a = 10;
    int b = 30;
    public void method1(){
        int c = 40;
//        static int b=4;
        System.out.println("Local variable is: "+c);
        Variables obj3 = new Variables();
//        System.out.println(obj3.d);
        System.out.println(obj3.a);
        System.out.println(obj3.b);
    }

    public static void main(String[] args) {

        int d=191;
        Variables obj1 = new Variables();
//        System.out.println(obj1.c); // local variable cannot be accessed by the object of a class
        System.out.println(obj1.a);// static variable
        System.out.println(obj1.b);// instance variable
        Variables obj2 = new Variables();
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        obj2.a=50;
        obj2.b=60;
        System.out.println("Static variable after change: "+obj2.a);
        System.out.println("Instance variable after change: "+obj2.b);
        System.out.println("Static variable after change accessed via different object: "+obj1.a);
        System.out.println("Instance variable after change accessed via different object: "+obj1.b);

// widening
        int t = 10;
        float f = a;
        System.out.println(t);
        System.out.println(f);

//  narrowing(Typecasting)(explicit vs implicit)
     float x = 10.6f;
     int y =(int)x;
        System.out.println(x);
        System.out.println(y);


        obj1.method1();
        System.out.println(a);
        a=222;
        System.out.println(a);
        System.out.println(a);

    }


}

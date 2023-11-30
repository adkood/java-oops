package oops.staticstuff;

public class A {
    
    static int a = 10;
    static int b;

    //static block
    static {
        System.out.println(" run only one time i.e. when the first object is created");
        b = 2*10;
    }

    static void func1()
    {
        System.out.println("statix func1");
    }
    
    void func()
    {
        func1();
        System.out.println("non static func");
    }
    
    public static void main(String[] args) {
        
        // ------cannot call a non static method inside static method without creating a object
        // func();

        // A a = new A();
        // a.func();

        A first = new A();
        System.out.println(A.a + " " + A.b);
        A.a = 20;
        A second = new A();
        System.out.println(A.a + " " + A.b);
    }
}

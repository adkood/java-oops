package oops.javaInterface;

public class D implements StaticMethod{

    // overrriden deafault func visibility should be higher
    public void func2() {
        System.out.println("default oevrridden");
    }

    public static void main(String[] args) {
        // C c = new C();
        // c.funcA();
        // c.funcB();
        // D d = new D();
        // d.func2();
        
        next nx = new next(); 
        nx.func();
    }
}

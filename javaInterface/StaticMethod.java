package oops.javaInterface;

public interface StaticMethod {
    
    static void func() {
        System.out.println("static method here, you have to complete my body");
    }

    default void func2() {
        System.out.println("default method also requires a body");
    }
}

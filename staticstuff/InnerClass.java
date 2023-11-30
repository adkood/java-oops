package oops.staticstuff;

public class InnerClass {
    
    static class InsideClass {
        int a;
        void func() {
            System.out.println("from inside class");
        }
    }

    public static void main(String[] args) {
        InsideClass i = new InsideClass();
    }
}

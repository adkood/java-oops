package oops.javaInterface;

public class Nested {
    public interface nest {
        int b = 1;
        void func();
    }
}

class next implements Nested.nest{
    @Override
    public void func() {
       System.out.println("nested func");
    }
}
package oops.javaInterface;

public class E implements Engine {

    @Override
    public void start() {
        System.out.println("engine started");
    }

    @Override
    public void stop() {
        System.out.println("engine stoped");
    }
}

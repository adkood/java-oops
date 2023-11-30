package oops.javaInterface;

public class Main implements Engine,MusicPlayer {

    @Override
    public void start() {
        System.out.println("something started");
    }

    @Override
    public void stop() {
        System.out.println("something stoped");
    }
    
    public static void main(String[] args) {
        
        Main m = new Main();
        m.start();
        m.stop();
    }
}

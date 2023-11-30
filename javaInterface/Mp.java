package oops.javaInterface;

public class Mp implements MusicPlayer{
    
    @Override
    public void start() {
        System.out.println("music started");
    }

    @Override
    public void stop() {
        System.out.println("music stoped");
    }

}

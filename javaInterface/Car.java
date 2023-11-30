package oops.javaInterface;

public class Car {

    private E engine = new E();
    private Mp musicPlayer = new Mp();

    void startCar() {
        engine.start();
    };

    void stopCar() {
        engine.stop();
    };

    void startMusic() {
        musicPlayer.start();
    };

    void stopMusic() {
        musicPlayer.stop();
    };

    public static void main(String[] args) {
        
        Car c = new Car();
        c.startCar();
        c.startMusic();

    }

}

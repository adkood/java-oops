package oops.staticstuff;

public class Singleton {
    
    static private Singleton var;

    private Singleton() {
        System.out.println("constructor called!!");
    }

    public static Singleton getInstance() {
        if(var == null)
        {
            var = new Singleton();
            return var;
        }
        else{
            return var;
        }
    }

}

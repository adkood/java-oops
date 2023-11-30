package oops.exception;

public class Cloning implements Cloneable{
    
    int a;
    int b;

    public Cloning(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Cloning(Cloning other)
    {
        this.a = other.a;
        this.b = other.b;
    }

    // faster way of cloning 
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}

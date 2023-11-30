package oops.accessmodifiers; 

import oops.pillars.Gang;

public class Gurgaun extends Gang{  

    int ritish;

    // ------------variable shadowing------------------------
    // you can shadow variables in Java by declaring variables with the same name in a subclass, 
    // but this is not the same as overriding variables. Variable shadowing creates a separate 
    // variable within the subclass, and the variable in the superclass remains unaffected.
    
    int ashutosh;

    Gurgaun(Gurgaun other)
    {  
        super(other);
        this.ritish = other.ritish;
        this.ashutosh = other.ashutosh;
    }

    Gurgaun(int ritish,int ashutosh)
    {
        this.ritish = ritish;
        this.ashutosh = ashutosh;
    }

    @Override
    public String toString() {
        return "overridden-boi";
    }

    public static void main(String[] args) {
        // Gang g = new Gang(1,2,3,4,5,6);
        
        Gurgaun g = new Gurgaun(10,11);
        System.out.println(g.ashutosh);
        System.out.println(Gang.ashutosh);

        
        
    }
}

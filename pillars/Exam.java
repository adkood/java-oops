package oops.pillars;

public class Exam extends Gang{
    
    int aditya;
    int ira;
    // int rohan;
    
    //----------------early and late binding-----------------
    
    //this if called early binding why beacause java decides which method to run in compile time
    // public final void hello()
    // {
    //     System.out.println("hello from Exam class !!");
    // }
    
    // this is called late binding because here java is deciding which method to run in runtime
    // public void hello()
    // {
    //     System.out.println("hello from Exam class !!");
    // }
    
    
    Exam(Exam other)
    {
        super(other);
        this.aditya = other.aditya;
        this.ira = other.ira;
    }
    
    Exam(int ashutosh,int pp,int rohan,int elham,int taruna,int vanshika,int aditya,int ira)
    {
        super(ashutosh,pp,rohan,elham,taruna,vanshika);

        this.aditya = aditya;
        this.ira = ira;
        // super.rohan = rohan;
    }

    public static void main(String[] args) {
        // Gang g = new Gang(1,2,3,4,5,6);
        // System.out.println(g.ashutosh);
        // System.out.println(g.pp);
        // System.out.println(g.rohan);
        // System.out.println(g.elham);
        // System.out.println(g.taruna);
        // g.elhamSePucho();
        
        // Exam e = new Exam(1,2,3,4,5,6,7,8);
        
        //-----Creating super class object with the constructor of its child class is possible; 
        // Gang g = new Exam(1,2,3,4,5,6,7,8);
        
        // using copy constructor
        Exam e = new Exam(1,2,3,4,5,6,7,8);
        // e.hello();
        Gang g = new Exam(e);
        // Gang g = new Gang();
        g.hello();
        // -----Not possible
        // Exam e = new Gang(1,2,3,4,5,6);
        
        // reference type -> access value;
        // obeject -> use methods
        // -> this is known as upcasting
        // java decides which method to use in runtime by dynamic method dispatching
        
    }
}

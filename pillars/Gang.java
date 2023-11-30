package oops.pillars;

public class Gang{
    public static int ashutosh;
    int pp;
    int rohan;
    int elham;
    int taruna;
    private int vanshika;

    void elhamSePucho()
    {
        System.out.println(this.vanshika);
    }
    
    void elhamKoBolo(int val){
        this.vanshika = val; 
    }
    
    //------------- you cannot override a static method but you can inherit it
    // public static void hello()
    // {
    //     System.out.println("hello from Gang class !!");
    // }
    
    public void hello()
    {
        System.out.println("hello from Gang class !!");
    }
    
    public Gang()
    {
        Gang.ashutosh = -2;
        this.pp = -1;
        this.rohan = -1;
        this.elham = -1;
        this.taruna = -1;
        this.vanshika = -1;
    }
    
    public Gang(Gang other)
    {
        Gang.ashutosh = other.ashutosh;
        this.pp = other.pp;
        this.rohan = other.rohan;
        this.elham = other.elham;
        this.taruna = other.taruna;
        this.vanshika = other.vanshika;
    }
    
    public Gang(int ashutosh,int pp,int rohan,int elham,int taruna,int vanshika)
    {
        Gang.ashutosh = ashutosh;
        this.pp = pp;
        this.rohan = rohan;
        this.elham = elham;
        this.taruna = taruna;
        this.vanshika = vanshika;
    }
}
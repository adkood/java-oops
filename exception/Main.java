package oops.exception;

public class Main {

    public static int divide(int a,int b) throws Exception {
        if(b == 0)
        {
            throw new Exception("b cannot be 0 !!!!!");
        }

        return a/b;
    } 

    public static void main(String[] args) {
        // try {
        //     divide(5,1);
        //     throw new Customexception("divide ho gaya :)");
        // } catch (Exception exp) {
        //     System.out.println(exp.getMessage());
        // } finally {
        //     System.out.println("will always execute");
        // }
        
        Cloning c1 = new Cloning(1, 2);

        // Cloning this way takes too much time !!
        Cloning c2 = new Cloning(c1); 
        
    }

}
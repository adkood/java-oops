package oops.abstractclass;

public class Result {
    
    public static void main(String[] args) {
        
        // can not create object of abstract class and constructor can't be abstract
        // Parent p = new Parent();

        People a = new People();
        a.career("a chose career1");

        People b = new People();
        b.career("b chose career2");
    }

}